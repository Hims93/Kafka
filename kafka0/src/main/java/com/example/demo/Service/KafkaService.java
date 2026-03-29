package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UserDto;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate<String, UserDto> kafkaTemplate;

	public String sendMsg(UserDto user) {

		kafkaTemplate.send("himesh", "userdata", user);
		return "Message Sent By Kafka Producer";

	}

}
