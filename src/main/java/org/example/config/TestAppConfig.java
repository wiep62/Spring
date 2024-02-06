package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(
        value = {
                @PropertySources("classpath:application-test.properties")
        }
)
@Profile("test")

public class TestAppConfig {
}
