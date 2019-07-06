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
		
		
		
	//	cars.add(new Car(make,model,year,color,price));
		
		Iterator<Car> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(" ");
	}
	
	
	public static void AcceptOrReject(List <Car> cars, int c) {
		
		
		
		
			System.out.println("offer accepted.");
			System.out.println(" ");
			System.out.println("This is the car to be removed:");
			System.out.println("-----------------");
			System.out.println(cars.get(c).toString());
			
			

			
		
	}
	
	
	
	public static void carsOnLot(List<Car> cars) {
		
		
	
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


	public static void SystemUpdateOwnership(List<Car> carLot, List<Car> customerLot, int customerOffer) {
		//Car a = carLot.get(customerOffer);
		String model = (carLot.get(customerOffer).getMake());
		String make = (carLot.get(customerOffer).getModel());
		int year = (carLot.get(customerOffer).getYearMade());
		String color = (carLot.get(customerOffer).getColor());
		double price = (carLot.get(customerOffer).getCurrentPrice());
	//	customerLot.add(new Car(model,make,year,color,price,"Sold"));
		
		//return customerLot;
	}
	
	

}