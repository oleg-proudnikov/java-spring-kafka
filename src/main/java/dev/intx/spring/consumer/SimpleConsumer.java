package dev.intx.spring.consumer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Data
public class SimpleConsumer {

    int cnt = 0;

    @KafkaListener(topics = "${spring.kafka.consumer.topic}")
    public void consume(String data) {
        if (++cnt % 1000000 == 0) {
            LOG.info(Integer.toString(cnt));
        }
    }
}
