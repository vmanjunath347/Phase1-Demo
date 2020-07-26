package com.simplilearn.typecasting;

public class ExplicitTypeCastingDemo {
	public static void main(String[] args) {
	//explicit typecasting or narrowing
	
	//double--float--long--int--shot--byte
	
	//make shure tat the range is also compatable
	
	double price=100.49;
	
	long pricelong = (long) price;
	
	int prieInt = (int) price;
	
	byte priceByte= (byte) pricelong;
	
	System.out.println("double Price: "+price);
	System.out.println("bytw Price: "+priceByte);
	
	}

}
