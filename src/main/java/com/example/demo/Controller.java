package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private Summarizeservice summarizeservice;
    @PostMapping("/summarize")
    public String Summarize(@RequestBody String ticket){

        return summarizeservice.summarize(ticket);
    }
}
