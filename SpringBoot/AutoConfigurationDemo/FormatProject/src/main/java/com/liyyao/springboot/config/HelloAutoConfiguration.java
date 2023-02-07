package com.liyyao.springboot.config;

import com.liyyao.springboot.service.FormatProcessor;
import com.liyyao.springboot.util.HelloFormatTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(FormatAutoConfiguration.class)
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(FormatProcessor formatProcessor) {
        return new HelloFormatTemplate(formatProcessor);
    }
}
