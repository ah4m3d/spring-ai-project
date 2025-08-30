package com.example.springaiproject.controller;

import com.example.springaiproject.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final AiService aiService;

    @Autowired
    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ask")
    public String askQuestion(@RequestParam("question") String question) {
        return aiService.generateResponse(question);
    }
}
