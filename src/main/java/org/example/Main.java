package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
BeanFactory beanFactory = new BeanFactory();
//регистрируем бины:
    beanFactory.register(Injectable.class);
    beanFactory.register(Source.class);

        //получим бин соурс:
        Source source = beanFactory.getBean(Source.class);
        //вывод на консоль:
        source.call();

    }
    }
