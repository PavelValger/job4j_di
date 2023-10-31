package ru.job4j.annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru/job4j/annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    @Order(11)
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    @Order(2)
    public Dog getDog() {
        return new Dog("SecondDog");
    }

    @Bean
    @Order(7)
    public Dog someDog() {
        return new Dog("Dog");
    }
}
