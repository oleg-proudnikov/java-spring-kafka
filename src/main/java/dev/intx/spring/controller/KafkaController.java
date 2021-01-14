package dev.intx.spring.controller;

import dev.intx.spring.consumer.SimpleConsumer;
import dev.intx.spring.model.Greeting;
import dev.intx.spring.service.HelloWorldService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController implements KafkaV1 {

    private final SimpleConsumer consumer;

    public KafkaController(SimpleConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public int getCounter() {
        return consumer.getCnt();
    }

    @Override
    public int resetCounter() {
        consumer.setCnt(0);
        return consumer.getCnt();
    }
}
