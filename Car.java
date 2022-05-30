package com.eval2;

import java.util.Scanner;

public class Car {
	
	int numberOfPassenger;
	int numberOfKms;
	
}


class Sedan extends Car{
	final int farePerKm = 20;
	
}

class HetchBack extends Car{
	final int farePerKm = 15;
	
}

class OLA{
	int fare;
	public Car bookCar(int numberOfPassenger, int numberOfKms)
	{
		if(numberOfPassenger<=3)
		{
			fare = new HetchBack().farePerKm;
			return new HetchBack();
		}
		else {
			fare = new Sedan().farePerKm;
			return new Sedan();
		}
		
	}
	public int calculateBill(Car car)
	{
		int a = car.numberOfKms;
		int totalFare = a * fare;
		return totalFare;
		
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Passengers");
		int pass = sc.nextInt();
		System.out.println("Enter the number of Kms");
		int kms = sc.nextInt();
		
		Car car = new Car();
		car.numberOfKms = kms;
		car.numberOfPassenger=pass;
		
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(pass, kms);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is: "+ car.numberOfKms * myOla.fare);
//		System.out.println("number of kms:"+car.numberOfKms);
//		System.out.println("myola fare:"+myOla.fare);
		
		sc.close();
	}
}


//numberOfPassenger :int
//numberOfKms:int

//Create a class Sedan that extends Car that has following fields:
//
//final int farePerKm =20;
//
//Create a class HatchBack that extends Car that has following fields:
//
//final int farePerKm =15;
//
//Create a class OLA that has following methods-
//public Car bookCar(int numberOfPassenger, int numberOfKMs)
//
//public int calculateBill(Car car)


//Implement the bookCar method in such a way that if the numberOfPassenger is less
//than or equal to 3 then you should return the object of HatchBack else you should
//return the object of Sedan.
//
//Note : Set the fields of HatchBack and Sedan object appropriately.
//
//Implement calculateBill method to calculate the total fare by using-
//Total fare=numberOfKms*farePerKm
//
//Create a Main class with main method inside this main method take the input from the
//user for the number of passengers and number of kms using the Scanner class and
//call bookCar method using appropriate arguments and use this returned object in the
//calculate bill method to calculate the total fare.
//
//Eg- main():
//
//public static void main(String[] args) {
//
//Scanner scanner = new Scanner(System.in);
//
////Write logic to get numberOfPassenger and numberOfKms
//
//Ola myOla = new Ola();
//Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
//int res = myOla.calculateBill(myCar);
//
//System.out.println("The total fare amount is"+ res);
//}