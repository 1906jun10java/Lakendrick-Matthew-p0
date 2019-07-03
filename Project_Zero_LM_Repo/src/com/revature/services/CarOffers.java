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
	
	
	
	public static void removeMethod(int n) {
		
		//List <Car> carLot = new ArrayList<>();

		//carLot.add(new Car("Toyota", "camry", 2000, "red", 60000d));

		//carLot.add(new Car("Nissan", "hootie", 2103, "blue", 45000d));

		//carLot.add(new Car("toyota", "Avalon", 2014, "yellow", 50000d));
		
		//carLot.remove(n);
		
		//for (Car x : carLot) {
		//	System.out.println(x);
	//	}
		
		}
	
	
	public static void addMethod(List<Car> cars) {
		//List <Car> carLot = new ArrayList<>();
		//carLot.add(new Car("Toyota", "camry", 2000, "red", 60000d));

		//carLot.add(new Car("Nissan", "hootie", 2103, "blue", 45000d));

		//carLot.add(new Car("toyota", "Avalon", 2014, "yellow", 50000d));
		
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
		
		
	}
	
	
	public static void EmployeePendingOffers( ) {
		
	}
	
	public static void SystemUpdateOwnership() {
		
		
	}
	
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

}