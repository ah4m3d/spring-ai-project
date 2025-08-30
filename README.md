# Spring AI Project

A clean and simple Spring Boot application that integrates with Ollama's AI models for text chat.

## Features

🤖 **AI Chat**: Interactive conversation with Ollama's llama3 model
� **Modern UI**: Clean, responsive web interface
🔧 **Java 24 Compatible**: Uses Byte Buddy experimental mode

## Quick Start

1. **Prerequisites**
   - Java 24+
   - Maven 3.6+
   - Ollama installed and running

2. **Setup Ollama**
   ```bash
   # Install Ollama
   curl -fsSL https://ollama.com/install.sh | sh
   
   # Pull the llama3 model
   ollama pull llama3
   ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run -Dnet.bytebuddy.experimental=true
   ```

4. **Access the UI**
   Open http://localhost:8080 in your browser

## API Endpoints

### Chat Endpoint
```bash
POST /api/ai/ask
Content-Type: application/json

{
  "question": "What is the capital of France?"
}
```

## Web Interface

The application provides a simple, clean chat interface where you can:
- Have conversations with the AI
- Get responses powered by Ollama's llama3 model
- Enjoy a responsive design that works on all devices

## Stable Diffusion Setup (Optional)

To enable actual image generation, set up Stable Diffusion WebUI:

1. Install [AUTOMATIC1111 WebUI](https://github.com/AUTOMATIC1111/stable-diffusion-webui)
2. Start with API enabled: `./webui.sh --api`
3. The application will automatically detect it at `http://localhost:7860`

## Configuration

### application.properties
```properties
# Ollama Configuration
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.options.model=llama3
spring.ai.ollama.chat.options.temperature=0.7

# Logging
logging.level.com.example.springaiproject.service.AiService=INFO
```

## Architecture

- **SpringAiProjectApplication.java**: Main application class
- **AiController.java**: REST API endpoints
- **ChatController.java**: Web UI controller
- **AiService.java**: Core AI integration service
- **OllamaConfig.java**: Ollama configuration
- **WebConfig.java**: CORS and web configuration
- **chat.html**: Modern web interface

## Java 24 Compatibility

This project uses Java 24 with Byte Buddy experimental mode:
```bash
mvn spring-boot:run -Dnet.bytebuddy.experimental=true
```

For testing:
```bash
mvn clean test -Dnet.bytebuddy.experimental=true
```

## Development

### Build
```bash
mvn clean compile
```

### Test
```bash
mvn test -Dnet.bytebuddy.experimental=true
```

### Package
```bash
mvn clean package -Dnet.bytebuddy.experimental=true
```

## Troubleshooting

1. **Ollama Connection Issues**
   - Ensure Ollama is running: `ollama serve`
   - Check if llama3 model is available: `ollama list`

2. **Java 24 Issues**
   - Always use `-Dnet.bytebuddy.experimental=true` flag
   - Ensure you're using compatible Spring Boot version (3.2.5)

3. **Image Generation Issues**
   - For SD mode: Ensure Stable Diffusion WebUI is running with `--api` flag
   - Check logs for connection errors

## Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Add tests
5. Submit a pull request

## License

This project is licensed under the MIT License.
