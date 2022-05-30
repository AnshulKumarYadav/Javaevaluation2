package com.eval2;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of Students: ");
		int students = sc.nextInt();
		for(int i=0;i<students;i++)
		{
			Student[] st = new Student[students];
			System.out.println(" Enter Roll number: ");
			int roll = sc.nextInt();
			System.out.println("Enter Name: ");
			String name = sc.next();
			System.out.println("Enter Address: ");
			String add = sc.next();
			System.out.println("Enter marks: ");
			int marks = sc.nextInt();
			
			Student stStudent = new Student(roll,name,add,marks);
			
		}
		sc.close();
		
	}
	
}
