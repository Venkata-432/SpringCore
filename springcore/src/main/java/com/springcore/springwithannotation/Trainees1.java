package com.springcore.springwithannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("trainees")
public class Trainees1 {

	@Autowired
	TrainerInterface1 tt;
	@Autowired
	LibraryInterface lt;
	@Autowired
	CanteenInterface ct;
	
	void display(){
		tt.teach();
		lt.bookRecord();
		ct.orderFood();
	}
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ct=new ClassPathXmlApplicationContext("springwithannotation.xml");
		Trainees1 tr=(Trainees1) ct.getBean("trainees");
		tr.display();
	}
}
