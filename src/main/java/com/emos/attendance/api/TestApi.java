package com.emos.attendance.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

    @GetMapping("/")
    public String test() {
        return "hello world";
    }
}
