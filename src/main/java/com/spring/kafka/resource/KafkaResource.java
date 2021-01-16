package com.spring.kafka.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.model.Student;

@RestController
@RequestMapping("/kafka")
public class KafkaResource {
	
	@Autowired
	private KafkaTemplate<String, Student> kafkaTemplate;
	
	private final static String TOPIC = "kafka_example";

	
	@PostMapping("/publish")
	public String postMessage(@RequestBody final Student student) {
		
		kafkaTemplate.send(TOPIC,student);
		
		return "Message is published successfully";
	}
}
