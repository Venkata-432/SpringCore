package com.springcore.springwithannotation;

import org.springframework.stereotype.Component;

@Component
public class Canteen implements CanteenInterface{

	public void orderFood() {
		System.out.println("food items ordered list");
		
	}

}
