package com.app1;


import com.app1.Config.AppConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App1 {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.run(AppConfiguration.class, args);
    }

}
