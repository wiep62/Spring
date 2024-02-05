package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BeanFactory {
private final Map<Class<?>, Object> container = new HashMap<>();
public void register(Class<?> type){
    Object mainBean = create(type);
    container.put(type, mainBean);

    for (Field field : type.getDeclaredFields()){
        //проверяем поле:
        if (field.isAnnotationPresent(Inject.class)){
            //мы попали на свойство которое есть в контейнере, изымаем его
            Object bean  =container.get(field.getType());
            //проверяем что у нас есть такой бин:
            if (bean == null) continue;
field.setAccessible(true);
            try {
                field.set(mainBean, bean);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
public <T> T getBean(Class<T> type){
    Object bean = container.get(type);
    if (bean == null) throw new NullPointerException();
    return (T) bean;
}
private final Object create(Class<?> type){
    try {
        return type.getDeclaredConstructor().newInstance();
    } catch (InstantiationException e) {
        throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
        throw new RuntimeException(e);
    } catch (NoSuchMethodException e) {
        throw new RuntimeException(e);
    }
}

}
