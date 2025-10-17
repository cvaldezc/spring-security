package com.chris.app_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/account")
public class AccountsController {

    @GetMapping
    public Map<String, String> account() {
        return Collections.singletonMap("msj", "account");
    }
}
