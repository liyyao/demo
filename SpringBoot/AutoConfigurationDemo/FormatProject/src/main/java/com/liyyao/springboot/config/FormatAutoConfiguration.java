package com.liyyao.springboot.config;

import com.liyyao.springboot.service.FormatProcessor;
import com.liyyao.springboot.service.impl.JsonFormatProcessor;
import com.liyyao.springboot.service.impl.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FormatAutoConfiguration {

    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    @Primary    //优先加载
    public FormatProcessor stringFormatProcessor() {
        return new StringFormatProcessor();
    }

    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    public FormatProcessor jsonFormatProcessor() {
        return new JsonFormatProcessor();
    }
}
