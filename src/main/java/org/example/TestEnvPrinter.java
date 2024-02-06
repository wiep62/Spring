package org.example;

import org.springframework.beans.factory.annotation.Value;

public class TestEnvPrinter implements EnvPrinter {

    //используем свойство из ПРОПЕРТИ файла
    @Value("${app.env}")
    private  String env;

    @Override
    public void EnvPrinter() {
        System.out.println("Calling TestEnvPrinter PrintEenv ");
        System.out.println("TestEnvPrinter env is : " + env);
    }
}
