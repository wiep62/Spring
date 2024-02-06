package org.example;

import org.springframework.beans.factory.annotation.Value;

public class ProdEnvPrinter implements EnvPrinter{

    @Value("${app.env}")
    private  String env;
    @Override
    public void EnvPrinter() {
        System.out.println("Calling ProdEnvPrinter PrintEenv ");
        System.out.println("ProdEnvPrinter env is : " + env);
    }
}
