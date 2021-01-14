package dev.intx.spring.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SimpleProducer {

    @Autowired
    private KafkaTemplate<String, String> template;

    @Value("${spring.kafka.producer.topic}")
    private String topic;

    public void produce(final String text) {
        final var future = template.send(topic, text);
        future.addCallback(
                result -> LOG.info("Sent"),
                e -> LOG.error(", e"));
    }
}
