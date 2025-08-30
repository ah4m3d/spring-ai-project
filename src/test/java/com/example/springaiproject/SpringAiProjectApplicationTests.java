

package com.example.springaiproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.ai.ollama.api.OllamaOptions;

@SpringBootTest(classes = SpringAiProjectApplication.class)
class SpringAiProjectApplicationTests {

    @MockBean
    private OllamaChatClient ollamaChatClient;

    @MockBean
    private OllamaOptions ollamaOptions;

    @Test
    void contextLoads() {
    }

}