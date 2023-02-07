package com.liyyao.springboot.springfactoriesloadertest;

import com.liyyao.springboot.TestCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFactoriesLoaderTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(SpringFactoriesLoaderTestApplication.class, args);
        TestCore bean = ca.getBean(TestCore.class);
        System.out.println(bean.study());
    }

}
