package com.mentalhealthChatbot.Controllers;

import com.mentalhealthChatbot.Service.ChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/chat")
public class ChatController {

   @Autowired
   private ChatService chatService;


   private Logger logger= LoggerFactory.getLogger(ChatController.class);

   @PostMapping("/generate")
   public String generateResponse(@RequestBody String message) {
      try {
         String response = chatService.getResponse(message);
         return response;
      } catch (RuntimeException e) {
         return e.getMessage();
      }
   }

}
