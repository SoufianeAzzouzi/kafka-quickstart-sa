package com.kodva.kafkademo.controller;

import com.kodva.kafkademo.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String msg) {
        messageProducer.sendMessage("my-topic", msg);
        return "Message sent : " + msg;
    }
}
