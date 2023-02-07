package com.liyyao.springboot.config;

import com.liyyao.springboot.properties.HelloProperties;
import com.liyyao.springboot.service.FormatProcessor;
import com.liyyao.springboot.util.HelloFormatTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @Bean
    public HelloFormatTemplate helloFormatTemplate(HelloProperties helloProperties, FormatProcessor formatProcessor) {
        return new HelloFormatTemplate(helloProperties, formatProcessor);
    }
}
