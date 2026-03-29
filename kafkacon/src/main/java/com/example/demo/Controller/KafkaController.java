package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.KafkaService;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	@Autowired
	KafkaService service;

	@GetMapping("/getuser")
	public ResponseEntity<String> getUser() {
		String res = service.getMsg();
		return new ResponseEntity<String>(res, HttpStatus.OK);
	}

}
