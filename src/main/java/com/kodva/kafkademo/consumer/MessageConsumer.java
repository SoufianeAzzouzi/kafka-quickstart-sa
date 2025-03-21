package com.kodva.kafkademo.consumer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    /**
     * Here, we specify the topic from which we will retrieve our message,
     * as well as the consumer group ID to which our consumer belongs
     *
     * @param message : consumed message, that was sent by the producer
     */
    @KafkaListener(topics = "my-topic", groupId = "${spring.kafka.consumer.group-id}")
    public void listen(String message) {
        logger.info(String.format("Message received : %s", message));
    }
}
