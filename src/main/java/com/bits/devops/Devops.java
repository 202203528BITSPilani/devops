package com.bits.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

public class Devops {

    private final String message;

    public Devops(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
