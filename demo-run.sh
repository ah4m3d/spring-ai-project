#!/bin/bash

echo "🤖 Spring AI Chat - Simple Demo"
echo "==============================="
echo ""

echo "Starting Spring AI Chat application..."
echo "This is a clean, simple chat interface powered by Ollama's llama3 model."
echo ""
echo "Features:"
echo "✅ Chat with AI using Ollama llama3"
echo "✅ Clean, responsive web interface"
echo "✅ Real-time conversation"
echo ""
echo "After startup, access the chat at: http://localhost:8080"
echo ""

# Run the application
mvn spring-boot:run -Dnet.bytebuddy.experimental=true
