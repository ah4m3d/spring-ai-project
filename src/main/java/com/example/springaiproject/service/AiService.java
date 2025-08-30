package com.example.springaiproject.service;

import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class AiService {

    private static final Logger logger = LoggerFactory.getLogger(AiService.class);
    private final OllamaChatClient ollamaChatClient;
    private final OllamaOptions ollamaOptions;

    public AiService(OllamaChatClient ollamaChatClient, OllamaOptions ollamaOptions) {
        this.ollamaChatClient = ollamaChatClient;
        this.ollamaOptions = ollamaOptions;
        logger.info("Configured Ollama model: {}", ollamaOptions.getModel());
    }

    public String generateResponse(String prompt) {
        logger.info("Using model: {}", ollamaOptions.getModel());
        return ollamaChatClient.call(new Prompt(prompt)).getResult().getOutput().getContent();
    }
}