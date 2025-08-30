package com.example.springaiproject.config;

import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OllamaConfig {

    @Bean
    public OllamaOptions ollamaOptions() {
        OllamaOptions options = new OllamaOptions();
        options.setModel("llama3");
        return options;
    }
}
