package org.example.ruigeforum.gatway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhao_rui
 * @Desc:
 * @create: 2024-10-14 08:00
 **/
@RestController
public class TestController {

    @GetMapping(value = "/test/echo")
    public String echo() {
        return "Hello Nacos Discovery";
    }
}
