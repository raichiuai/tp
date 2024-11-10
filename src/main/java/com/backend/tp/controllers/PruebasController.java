package com.backend.tp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebasController {
    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Endpoint accesible");
    }

}
