package com.liyyao.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public TestCore testCore() {
        return new TestCore();
    }
}
