package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// program to take input as integer value and convert to float, double, and byte
		
		System.out.print("Enter a number between 1-100:");
		Scanner input = new Scanner(System.in);					//taking input from system
		
		int inputAsInteger=input.nextInt();						//taking input as interger
		
		float inputAsFloat= inputAsInteger;                     //converting to float
		double inputAsDouble= inputAsInteger; 					//converting as double
		byte inputAsByte= (byte)inputAsInteger;                 //converting to byte
		
		//printing outputs
		
		System.out.println("User Input Value in Float: "+inputAsFloat);
		System.out.println("User Input Value in double: "+inputAsDouble);
		System.out.println("User Input Value in byte: "+inputAsByte);

	}

}
