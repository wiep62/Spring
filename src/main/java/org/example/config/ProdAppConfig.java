package org.example.config;

import org.example.EnvPrinter;
import org.example.ProdEnvPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-prod.properties")
@Profile("prod")
public class ProdAppConfig {

    @Bean
    public EnvPrinter envPrinter(){
        return new ProdEnvPrinter();
    }
}
