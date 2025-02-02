package com.mentalhealthChatbot.Service;
import org.springframework.ai.mistralai.MistralAiChatModel;
import org.springframework.ai.mistralai.MistralAiChatOptions;
import org.springframework.ai.mistralai.api.MistralAiApi;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@Service
public class ChatService {

    @Autowired
    private MistralAiChatModel chatModel;

    public String getResponse(String message) {

        try {
            // Call the AI model and return the response
            String response = chatModel.call(message);
            return response;
        } catch (Exception e) {
            return "Sorry, I couldn't process your request. Please try again later.";
        }
    }
}