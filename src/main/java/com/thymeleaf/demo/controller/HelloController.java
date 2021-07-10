package com.thymeleaf.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    private Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/path")
    public String path(@RequestParam String lang) {
        log.info(lang);
        return "user/" + lang + "/welcome";
    }
}
