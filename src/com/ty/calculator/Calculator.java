package com.ty.calculator;

public class Calculator {
	static int a=100;

	public static void add() {
		int b=50;
		int add=a+b;
		System.out.println(add);
	}
public static void sub() {
		int b=50;
		int sub=a-b;
		System.out.println(sub);
	}
public static void mul() {
	int b=50;
	int mul=a*b;
	System.out.println(mul);
}
public static void div() {
	int b=50;
	int div =a/b;
	System.out.println(div);
}
public static void main(String[] args) {
	add();
	sub();
	mul();
	div();
}
}
