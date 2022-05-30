package com.eval2;

public class Student {
	
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rool,String name,String addr,int marks){
		this.roll = rool;
		this.name = name;
		this.address = addr;
		this.marks = marks;
	}
	void display()
	{
		System.out.println("The roll is:"+roll);
		System.out.println("The name is: "+name);
		System.out.println("The address is: " +address);
		System.out.println("The marks is: "+marks);
	}
	
}


//roll: Integer
//name: String
//address: String
//marks: Integer


//Create a Demo class and perform the following operation in the main method:
//
//Take the number as input from the user, How many Student objects need to be
//created.
//Create an array of Students with those numbers.
//Initialize all the student objects by taking details from the user.
//print all the Student details.
//print the average of all the Student marks.