package com.scanner;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value :");
		//int num = 10;
		int num = scan.nextInt();
		System.out.println("Integer Value :" +num);
		int num1 = scan.nextInt();
		System.out.println("Long Value : " + num1);
		short num2 = scan.nextShort();
		System.out.println("Shrt Value :" +num2);
		byte num3 = scan.nextByte();
		System.out.println("Byte Value :" + num3);
		
		int add = num+num1;
		System.out.println("Addition of 2 number :" + add);
		
		float f= scan.nextFloat();
		System.out.println("float value :" + f);
		
		double d = scan.nextDouble();
		System.out.println("double value :" + d);
		
		String name = scan.next();
		
		System.out.println("String value : " + name);
		
		char c = scan.next().charAt(2);
		
		System.out.println("Character Value : " + c);

	}

}
