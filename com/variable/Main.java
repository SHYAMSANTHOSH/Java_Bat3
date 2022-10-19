package com.variable;

public class Main {
	public String name;
	private String name1;
	int a =10;
	
	public Main() {
		System.out.println("Welcome");
	}

	public Main(String nameall) {
		name = nameall;
	}
	
	public void setName(String nameall1) {
		name1 = nameall1;
	}
	
	public void printName() {
		System.out.println("public variable :" + name);
		System.out.println("private variable :"+ name1);
	}
	public static void main(String[] args) {
		//Main ma = new Main();
		Main ma1 = new Main("Shyam");
		ma1.setName("Kumar");
		ma1.printName();

	}

}
