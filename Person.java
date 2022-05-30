package com.eval2;

public class Person {
	
	String name;
	String gender;


	class Address{
		String city;
		String state;
		String pincode;
	}
}

class Instructor extends Person{
	int instructorId;
	int salary;
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + "]";
	}
	
}
class Students extends Person{
	int studentId;
	String courseEnrolled;
	int courseFee;
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + "]";
	}
	
}

class Main2{
	public static Person generatePerson(Person person) {
		return new Person();
	}
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Students());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent.toString());
		System.out.println(newTeacher.toString());
	}
}