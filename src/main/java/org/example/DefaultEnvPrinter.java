package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class DefaultEnvPrinter implements EnvPrinter {
  //  @Value("${app.env}")
    @Value("${spring.profiles.active}")
    private String env;
    @Override
    public void EnvPrinter() {
System.out.println("DefaultEnvPrinter calling ...");
System.out.println("Env is: " + env);
    }
}
