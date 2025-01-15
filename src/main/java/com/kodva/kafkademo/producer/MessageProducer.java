package com.kodva.kafkademo.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * Here, we pass the topic and the message (which we received from the controller)
     * to the Kafka template's send method in order to send them to the broker.
     *
     * @param topic     : destination topic
     * @param message   : message to store in the topic
     */
    public void sendMessage(String topic, String message){
        kafkaTemplate.send(topic, message);
    }
}
