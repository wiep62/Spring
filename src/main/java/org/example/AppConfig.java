package org.example;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@ComponentScan("org.example")
public class AppConfig {
@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
    PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
    //указываем настройки ЯМЛ
    YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
    yamlPropertiesFactoryBean.setResources(new ClassPathResource("application.yaml"));
   // configurer.setLocation(new ClassPathResource("application.properties"));
    configurer.setProperties(yamlPropertiesFactoryBean.getObject());
    //вернем настроеный соурс
    return configurer;
}
}
