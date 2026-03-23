package dev.moreiradev.AprendendoSpring.Ninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AprendendoSpringController {

    @GetMapping("/hello-world")
    public String helloworld(){
        return "Hello World Rafael";
    }
}
