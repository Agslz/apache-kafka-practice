package com.ags.backend.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(groupId = "group-1",
            topicPartitions = @TopicPartition(topic = "str-topic", partitions = {"0"}),
            containerFactory = "validMessageContainerFactory")
    public void listener0(String message){
        log.info("Recibiendo un mensaje {}", message);
        log.info("Listener0 ::: Recibiendo un mensaje {}", message);
    }

    @KafkaListener(groupId = "group-1",
            topicPartitions = @TopicPartition(topic = "str-topic", partitions = {"1"}),
            containerFactory = "validMessageContainerFactory")
    public void listener1(String message){
        log.info("Recibiendo un mensaje {}", message);
        log.info("Listener1 ::: Recibiendo un mensaje {}", message);
    }

    @KafkaListener(groupId = "group-1",
            topicPartitions = @TopicPartition(topic = "str-topic", partitions = {"1"}),
            containerFactory = "validMessageContainerFactory")
    public void listener2(String message){
        log.info("Recibiendo un mensaje {}", message);
        log.info("Listener2 ::: Recibiendo un mensaje {}", message);
    }

}
