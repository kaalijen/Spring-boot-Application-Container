package com.fazon.simplybytespringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestController {

    @GetMapping
    public String health() {
        return "Hello everyone, Jenkins pipeline code is ready to be here ";
    }
