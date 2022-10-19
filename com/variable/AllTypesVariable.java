package com.variable;

public class AllTypesVariable {
	
	static int num = 100;
	
	public void hello() {
		int a = 50;
		String city = "Coimbatore";
		System.out.println(city);
		System.out.println(a);
	}
	public void add(int c,int d) {
		int add = c+d;
		System.out.println(add);
	}
	
	public void divide(int c,int d) {
		int div = c/d;
		System.out.println(div);
	}
	public static void main(String[] args) {
		//Three Types of Variable 
		//1. Instance Variable 2. Class or Static Variable 3. Local Variable
		int num = 10;
		String name = "Shyam";
		
		int a = 10;
		int b = 5;
		System.out.println(num);
		System.out.println(name);
		System.out.println(AllTypesVariable.num);
		AllTypesVariable all = new AllTypesVariable();
		all.hello();
		all.add(a,b);
		all.divide(a,b);
	}

}
