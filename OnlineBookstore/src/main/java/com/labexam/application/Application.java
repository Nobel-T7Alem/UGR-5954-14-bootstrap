package com.labexam.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Nobel Tibebe UGR/5954/14
@SpringBootApplication
@ServletComponentScan("com.labexam")
@Configuration("applicationContext.xml")
@ComponentScan("com.labexam")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
