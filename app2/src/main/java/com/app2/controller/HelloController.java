package com.app2.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping(path = "/hello", method = {RequestMethod.GET})
    public ResponseEntity<String> hello(@RequestParam("name") String name){
       return new ResponseEntity<>("hello " + name + " from app2", HttpStatus.OK);
    }
}
