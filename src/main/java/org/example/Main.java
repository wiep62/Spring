package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     //   1.3 Spring Context:
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //должны передать сюда  АПП конфиг Класс, в котором лежат бины

        context.getBean(Worker.class).call();



    }
    }
