package com.springcore.springwithannotation;

import org.springframework.stereotype.Component;

@Component
public class Trainer1 implements TrainerInterface1{

	public void teach() {
		System.out.println("Trainer is teaching japaneese class");
		
	}

}
