package com.asouza.springai.controllers;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore")
public class BookstoreAssistantController {
    private final OpenAiChatClient chatClient;
    public BookstoreAssistantController(OpenAiChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/informations")
    public String bookstoreAssistantChat(@RequestParam(value = "message", defaultValue = "Quais são os livros best sellers do ano de 2023?") String message){
            return chatClient.call(message);
    }

}
