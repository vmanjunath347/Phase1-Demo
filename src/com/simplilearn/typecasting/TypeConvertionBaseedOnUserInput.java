package com.simplilearn.typecasting;

import java.util.Scanner;

public class TypeConvertionBaseedOnUserInput {

	public static void main(String[] args) {
		//do tyoecasting Bsaed on user Input
		System.out.print("Enter a number 1=100: ");
	
		Scanner input= new Scanner(System.in);
		
		String usernumber = input.nextLine();
		
		int userInt = Integer.parseInt(usernumber);
		double userDouble = Double.parseDouble(usernumber);
		long userLong=Long.parseLong(usernumber);
		
		System.out.println("User Input as integer : "+ userInt);
		System.out.println("User Input as double : "+ userDouble);
		System.out.println("User Input as long : "+ userLong);
		
		
		

	}

}
