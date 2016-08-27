package com.app2;


import com.app2.Config.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App2 {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.run(AppConfiguration.class, args);
    }

}
