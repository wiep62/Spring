package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example")
public class AppConfig {
@Bean
public LogicClass simpleLogicClass(){ //название класса это имя данного бина которое будет храниться как ключ по которому мы сможем получить созданный бин
    return new LogicClass();
}

    @Bean
    public LogicClass logicClassData(){
    return new LogicClass("Logic class data", 42);
    }

}
