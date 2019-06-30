package com.revature.services;
import java.util.ArrayList;
import come.revature.beans.*;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;

import java.util.Iterator;
public class CarOffers {
	

	//ArrayList<Car> carLot = new ArrayList<>();

	//carLot.add(new Car("Toyota", "camry", 2000, "red", 60000d));

	//carLot.add(new Car("Nissan", "hootie", 2103, "blue", 45000d));

	//carLot.add(new Car("toyota", "Avalon", 2014, "yellow", 50000d));
	
	
	
	
	
	public static void EmployeePendingOffers( ) {
		
	}
	
	public static void SystemUpdateOwnership() {
		
		
	}
	
	public static void carsOnLot() {
		
	ArrayList<Car> carLot = new ArrayList<>();

		carLot.add(new Car("Toyota", "camry", 2000, "red", 60000d));

		carLot.add(new Car("Nissan", "hootie", 2103, "blue", 45000d));

		carLot.add(new Car("toyota", "Avalon", 2014, "yellow", 50000d));
		
		for(Car x : carLot) {
			System.out.println(x);
			break;
		}
		
	}

}