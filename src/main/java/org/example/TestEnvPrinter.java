package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TestEnvPrinter implements EnvPrinter {

    @Value("${app.env}")

    private  String env;
    //используем свойство из ПРОПЕРТИ файла

    @Override
    public void EnvPrinter() {
        System.out.println("Calling TestEnvPrinter PrintEenv ");
        System.out.println("TestEnvPrinter env is : " + env);
    }
}
