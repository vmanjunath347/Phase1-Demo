package com.simplilearn.typecasting;

public class FirstTypeDemo {

	public static void main(String[] args) {
		// widening or typecasting
		int count=100;
		
		long countBig=count;
	
		float countFloat=countBig;
		
		System.out.println("int VAlue: "+count);
		System.out.println("int long: "+countBig);
		System.out.println("int float: "+countFloat);
		
	}

}
