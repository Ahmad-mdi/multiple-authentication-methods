package com.configsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @GetMapping("/authorization-server")
    public String authorizationServer() {
        return "Authorization Server";
    }

    @GetMapping("/microservices")
    public String microservices() {
        return "microservices";
    }
}
