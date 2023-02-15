package org.example.config;

import org.example.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "org.example")
public class MainConfig {

    @Bean
    public Person person() {
        return new Person("zsy");
    }
}
