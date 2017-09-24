package com.campus.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloTest {

    @RequestMapping("/")
    String home(){
        return "<html><h1>Hello Test Page!</h1></html>";
    }

    @RequestMapping("/now")
    String now_time(){
        return "now is " + (new Date()).toString();
    }



}
