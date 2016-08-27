package com.app1.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello", method = {RequestMethod.GET})
    public ResponseEntity<String> hello(@RequestParam("name") String name){
       return new ResponseEntity<>("hello " + name + " from app1", HttpStatus.OK);
    }

    @RequestMapping(path = "/helloApp2", method = {RequestMethod.GET})
    public ResponseEntity<String> helloApp2(@RequestParam("name") String name){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(URI.create("http://app2:8090/hello?name=" + name), String.class);
        return new ResponseEntity<>(responseEntity.getBody(), HttpStatus.OK);
    }
}
