package com.eval2;

public class Question1 {
/*
 * Q1) Explain the difference between IS-A and Has-A relationship with the help of an 
 * example and explain about access modifiers and their accessibility?
 * 
 * 
 * Ans. Is-A relationship:-  It defines a class is inherited by another class with separated classes.
 * Has-A relationship:- When a class is in a class that means Has-A relationship.
 * 
 * 
 * */
	
	public static void main(String[] args) {
		Question1 oneQuestion1 = new B();
		oneQuestion1.display();
		
		
	
		
	}
	
	// Is-A relationship
	
	void display()
	{
		System.out.println("I am in Question1 class");
	}
	
//	Has-A relationship
	
	class C{
		void display()
		{
			System.out.println("I am in C class");
		}
	}
	
	

}

class B extends Question1{
	@Override
	void display()
	{
		System.out.println("I am in B class");
	}
}
