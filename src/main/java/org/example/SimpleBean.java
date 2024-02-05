package org.example;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SimpleBean implements BeanNameAware {

    private String beanName;

public SimpleBean() {
    System.out.println("SimpleBean created");
}

@PostConstruct
public void afterInit(){
    System.out.println("SimpleBean calling afterInit");
}
@PreDestroy
public void beforeDestroy(){
    System.out.println("Simple Bean calling beforeDestroy");
}

/*    @Override
    public void destroy() throws Exception {
        System.out.println("Simple Bean calling beforeDestroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SimpleBean calling afterInit");

    }*/

    @Override
    public void setBeanName(String name) {
this.beanName = name;
    }

    public void printName(){
    System.out.println("Bean name is : " + beanName);
    }
}
