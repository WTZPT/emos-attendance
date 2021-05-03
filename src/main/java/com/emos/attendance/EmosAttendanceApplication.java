package com.emos.attendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class EmosAttendanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmosAttendanceApplication.class, args);
    }

}
