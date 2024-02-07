package com.gerson.confluentProducer.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaSenderRunner implements CommandLineRunner {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @Value("${spring.kafka.topic.output}")
    String topicName;

    @Autowired
    RandomNameGenerator randomNameGenerator;


    int i=1;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("COMMAND LINE RUNNER");
        while (true){
            Thread.sleep(2000);
            kafkaTemplate.send(topicName,randomNameGenerator.generateRandomName());
        }

    }
}
