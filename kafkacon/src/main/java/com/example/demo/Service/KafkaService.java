package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UserDto;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate<String, UserDto> kafkaTemplate;
	
	String msg;

	@KafkaListener(topics = "himesh", groupId = "user-group")
	public void getMsg(UserDto user) {
		msg = "Data from Kafka" + user;
		System.out.println(msg);
	}

	public String getMsg() {
		return msg;
	}	

}
