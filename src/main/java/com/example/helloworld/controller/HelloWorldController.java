package com.example.helloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/v1")
public class HelloWorldController {

    @GetMapping(value = {"/helloworld"})
    public ResponseEntity<String> helloWorld() {
        log.info("<-------------Inside HelloWorldController------------->");

        return new ResponseEntity("Inside HelloWorldController", HttpStatus.OK);
    }
}