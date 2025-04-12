package com.ivoyant.controller_application.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/controller")
public class MainController {

    @GetMapping("/check")
    public String healthCheck(){
        return "Health Check Working Fine...200-OK :)";
    }

    @GetMapping("/ok")
    public String health(){
        return "200...OK!";
    }

}
