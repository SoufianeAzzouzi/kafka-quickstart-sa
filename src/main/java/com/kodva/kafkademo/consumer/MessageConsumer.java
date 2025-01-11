package com.kodva.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "my-topic", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(String message) {
        System.out.println(" -> " + message);
    }
}
