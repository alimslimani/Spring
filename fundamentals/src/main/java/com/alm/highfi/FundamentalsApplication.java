package com.alm.highfi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.alm.highfi"})

public class FundamentalsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FundamentalsApplication.class, args);
    }
}
