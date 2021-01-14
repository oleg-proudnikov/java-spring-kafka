package dev.intx.spring.controller;

import dev.intx.spring.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface KafkaV1 {

    @GetMapping(path = "/kafka", produces = {"application/json"})
    int getCounter();

    @PostMapping(path = "/kafka", produces = {"application/json"})
    int resetCounter();
}
