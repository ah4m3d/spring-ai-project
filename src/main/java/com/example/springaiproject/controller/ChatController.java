package com.example.springaiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @GetMapping("/")
    public String index() {
        return "chat";
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }
}
