package com.kakfa_demo.config;

import com.kakfa_demo.constant.AppConst;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaConfig {
    @KafkaListener(topics = AppConst.LOCATION_UPDATE_TOPIC , groupId = AppConst.GROUP_ID) // this annotation is used to listen the messages produced by
    public void updateLocation(String value)
    {
        System.out.println(value);
    }
}
