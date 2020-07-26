package com.simplilearn.typecasting;

public class StringConvertion {

	public static void main(String[] args) {
		// converting string to primitive variables adn vise versa
		
		String stringPrice="100";
		
		int priceInt=Integer.parseInt(stringPrice);
		
		System.out.println("the string value: "+stringPrice);
		System.out.println("the integer value: "+priceInt);
		
		int num=10;
		
		String numString= String.valueOf(num);
		
		System.out.println("the string value: "+numString);
		System.out.println("the integer value: "+num);

	}

}
