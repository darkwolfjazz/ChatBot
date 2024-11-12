package com.mentalhealthChatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatbotAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatbotAppApplication.class, args);
		System.out.println("Chatbot application started");
	}

}
