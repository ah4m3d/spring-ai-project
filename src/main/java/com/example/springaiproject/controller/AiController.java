package com.example.springaiproject.controller;

import com.example.springaiproject.service.AiService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = "*")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ask")
    public String askQuestion(@RequestBody QuestionRequest request) {
        return aiService.generateResponse(request.getQuestion());
    }

    public static class QuestionRequest {
        private String question;

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }
    }
}
