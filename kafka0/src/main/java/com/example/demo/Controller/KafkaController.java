package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserDto;
import com.example.demo.Service.KafkaService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	@Autowired
	KafkaService service;

	@PostMapping("/adduser")
	public ResponseEntity<String> addUser(@RequestBody UserDto user) {
     String res =service.sendMsg(user);
     return new ResponseEntity<String>(res,HttpStatus.OK);
	}

}
