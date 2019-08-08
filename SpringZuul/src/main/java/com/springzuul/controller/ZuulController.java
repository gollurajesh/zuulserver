package com.springzuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {

	@RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
