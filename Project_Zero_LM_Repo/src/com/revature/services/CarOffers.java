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
		System.out.println("-----");
		System.out.println("Make: ");
		System.out.println("-----");
		String make = scan.nextLine();
		System.out.println("------");
		System.out.println("Model: ");
		System.out.println("------");
		String model = scan.nextLine();
		System.out.println("------");
		System.out.println("Color: ");
		System.out.println("------");
		String color = scan.nextLine();
		System.out.println("----------");
		System.out.println("Year Made: ");
		System.out.println("----------");
		int year = scan.nextInt();
		System.out.println("------");
		System.out.println("Price: ");
		System.out.println("------");
		double price = scan.nextDouble();
		
		
		cars.add(new Car(make,model,year,color,price));
		
		Iterator<Car> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(" ");
	}
	
	
	public static void AcceptOrReject(List <Car> cars, int c) {
		
		
		
			System.out.println("---------------");
			System.out.println("Offer Accepted.");
			System.out.println("---------------");
			System.out.println("------------------");
			System.out.println("Car to be Removed: ");
			System.out.println("------------------");
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
		return number;
	}
	
	public static void CalculatePayments(List<Car> cars, int n, double d, int m) {
		double remainingBalance = (cars.get(n).getCurrentPrice()) - d;
		double monthlyPayment = remainingBalance / m;
		System.out.println("Balance on car: " + remainingBalance);
		System.out.println("Monthly Payment: " + monthlyPayment);
		
		
		
	}


	public static void SystemUpdateOwnership(List<Car> carLot, List<Car> customerLot, int customerOffer) {
		//Car a = carLot.get(customerOffer);
		String model = (carLot.get(customerOffer).getMake());
		String make = (carLot.get(customerOffer).getModel());
		int year = (carLot.get(customerOffer).getYearMade());
		String color = (carLot.get(customerOffer).getColor());
		double price = (carLot.get(customerOffer).getCurrentPrice());
		customerLot.add(new Car(model,make,year,color,price));
		
		//return customerLot;
	}
	
	

}