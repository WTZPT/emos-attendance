package com.emos.attendance.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("TestAPI")
public class TestApi {

    @ApiOperation("helllo world")
    @GetMapping("/")
    public String test() {
        return "hello world";
    }
}
