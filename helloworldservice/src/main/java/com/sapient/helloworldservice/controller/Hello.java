package com.sapient.helloworldservice.controller;

import com.sapient.helloworldservice.annotation.LogExecutionTime;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    @LogExecutionTime
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("hello world");
    }
}
