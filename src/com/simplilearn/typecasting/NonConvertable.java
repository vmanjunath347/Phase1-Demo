package com.simplilearn.typecasting;

public class NonConvertable {

	public static void main(String[] args) {
		// cannot converrt char or boolean to other data types
		
		char firstCharacter="c";
		int number=0;
		number=firstCharacter;
		
		System.out.println("number "+number);

	}

}
