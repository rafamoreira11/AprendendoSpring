package dev.moreiradev.AprendendoSpring.Missoes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missoes")
    public String helloninjas(){
        return "Hello Ninjas!";
    }
}
