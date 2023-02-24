package com.vit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Lombok annotation for logger
@Slf4j
//Spring annotation
@SpringBootApplication
public class SpringbootandGoogleRecaptchaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootandGoogleRecaptchaApplication.class, args);
        log.info("springboot and google re-captcha application started successfully.");
    }

}
