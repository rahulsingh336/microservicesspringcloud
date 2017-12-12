package com.rs.docker.service.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

    //@load
    private RestTemplate restTemplate;

    @GetMapping
    public String ping() {
        return "ping successful";
    }


}
