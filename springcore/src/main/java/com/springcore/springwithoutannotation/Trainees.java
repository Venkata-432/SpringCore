package com.springcore.springwithoutannotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Trainees {

	TrainerInterface tt;
	
	
	public TrainerInterface getTt() {
		return tt;
	}

	public void setTt(TrainerInterface tt) {
		this.tt = tt;
	}

	void display(){
		tt.teach();
	}
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cls=new ClassPathXmlApplicationContext("springcorewithoutannotation.xml");
		Trainees te=(Trainees) cls.getBean("trainees");
//		TrainerInterface te=new Trainee();
//		t.setTt(te);
		te.display();
	}
}
