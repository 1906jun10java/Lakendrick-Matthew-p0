package com.revature.services;
import java.util.ArrayList;
import com.revature.beans.*;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
public  class CarOffers {
	
	
	
	public static void removeMethod(int n, List<Car> cars) {
		
		
		
		cars.remove(n);
		
		
		
		}
	
	
	public static void addMethod(List<Car> cars) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("make: ");
		String make = scan.nextLine();
		System.out.println("model: ");
		String model = scan.nextLine();
		
		System.out.println("color: ");
		String color = scan.nextLine();
		System.out.println("Year made: ");
		int year = scan.nextInt();
		
		System.out.println("Price: ");
		double price = scan.nextDouble();
		
		
		
		cars.add(new Car(make,model,year,color,price,"not sold"));
		
		Iterator<Car> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(" ");
	}
	
	
	public static void AcceptOrReject(List <Car> cars, int n , int c) {
		
		
		
		if (n == 1) {
			System.out.println("offer accepted.");
			System.out.println(" ");
			System.out.println("This is the car to be removed:");
			System.out.println("-----------------");
			System.out.println(cars.get(c).toString());
			
			

			
						
		}
		
		if(n == 2) {
			System.out.println("offer rejected");
			System.out.println(" ");
			

		}
	}
	
	//public static void SystemUpdateOwnership(List<Car> cars,List<Car> ownerLot, int c) {
		
	//	ownerLot.add(cars.get(c));
		

	//}
	
	public static void carsOnLot(List<Car> cars) {
		
		//List <Car> carLot = new ArrayList<>();

		//carLot.add(new Car("Toyota", "camry", 2000, "red", 60000d));

		//carLot.add(new Car("Nissan", "hootie", 2103, "blue", 45000d));

		//carLot.add(new Car("toyota", "Avalon", 2014, "yellow", 50000d));
		
	
		Iterator<Car> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		
		}
		
	}
	
	public static int ChosenCar(List<Car> cars,int n) {
		System.out.println(" ");
		System.out.println(cars.get(n).toString());
		System.out.println(" ");
		int number = n;
		return n;
	}
	
	public static void CalculatePayments(List<Car> cars, int n, double d, int m) {
		double remainingBalance = (cars.get(n).getCurrentPrice()) - d;
		double monthlyPayment = remainingBalance / m;
		System.out.println("Balance on car: " + remainingBalance);
		System.out.println("monthlyPayment: " + monthlyPayment);
		
		
		
	}


	public static List<Car> SystemUpdateOwnership(List<Car> carLot, List<Car> customerLot, int customerOffer) {
		Car a = carLot.get(customerOffer);
		customerLot.add(new Car(a));
		System.out.println(a.toString());
		return customerLot;
	}
	
	

}