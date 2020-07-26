package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// program to take input as string value and convert to int, byte, float and double
		
				System.out.print("Enter a number between 1-100:");
				Scanner input = new Scanner(System.in);					//taking input from system
				
				String inputAsString=input.nextLine();				    //taking input as string
				
				int inputAsInteger= Integer.parseInt(inputAsString);    //converting to int
				double inputAsDouble= Double.parseDouble(inputAsString); 	//converting as double
				byte inputAsByte= Byte.parseByte(inputAsString);         //converting to byte
				float inputAsFloat=Float.parseFloat(inputAsString);     //converting to float
				
				
				//printing outputs
				
				System.out.println("User Input Value in Float: "+inputAsFloat);
				System.out.println("User Input Value in double: "+inputAsDouble);
				System.out.println("User Input Value in byte: "+inputAsByte);
				System.out.println("User Input Value in integer: "+inputAsInteger);

	}

}
