package com.example.demo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class Summarizeservice {

    private ChatClient chatClient;

    public Summarizeservice(ChatClient.Builder builder){
        this.chatClient = builder.build();
    }
    public String summarize(String ticket ){
   String output = chatClient.prompt()
           .user("Summarize this support tciket in 2 lines "+ticket)
           .call()
           .content();
   return output;

    }
}
