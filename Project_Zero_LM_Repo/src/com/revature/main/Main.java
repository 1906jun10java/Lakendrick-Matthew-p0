package com.revature.main;
import com.revature.beans.*;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashSet;
import java.util.List;

import com.revature.services.CarOffers;
import com.revature.services.CarOffers.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * prompt the welcome menu and ask the user
		 * for their username and password.
		 */
		List <Car> carLot = new ArrayList<Car>();

		carLot.add(new Car("Toyota", "camry", 2000, "red", 60000d,"not sold"));

		carLot.add(new Car("Nissan", "hootie", 2103, "blue", 45000d,"not sold"));

		carLot.add(new Car("toyota", "Avalon", 2014, "yellow", 50000d,"not sold"));
		
		
		boolean signedIn = true;
		while(signedIn) {
		System.out.println("Welcome to the site! Below, enter your username and password.");
		System.out.println("-------------------------------------------------------------");

		System.out.println(" ");
		System.out.println("Enter Username: ");
		System.out.println("--------------");

		//opens up the scanner for user input
		Scanner sc = new Scanner(System.in);

		String username = sc.nextLine();


		System.out.println(" ");
		System.out.println("Enter Password: ");
		System.out.println("---------------");


		String password = sc.nextLine();

		// Asks the user if their an employee or customer.		
		System.out.println("Are you an employee or customer? 1.for Employee and 2. for Customer");
		System.out.println(" ");

		int question = sc.nextInt() ;
		// these are used to decide what menu to show.
		int answerCustomer = 2;
		int answerEmployee = 1;

		// this will display the employee menu.
		if (question == answerEmployee ) {
			
			boolean switchControl2 = true;
			while(switchControl2) {

			System.out.println("Welcome to the employee portal. Choose your options below.");
			System.out.println("---------------------------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Add or remove a car.");
			System.out.println("3. Accept or reject offer.");
			System.out.println("4. Sign out.");

			// This is used to access the options on the employee menu.
			
			int choice = sc.nextInt();
			
			
				switch (choice) {

				case 1:
					System.out.println(" These are the available cars: ");
					CarOffers.carsOnLot(carLot);
					System.out.println(" ");
					break;

				case 2:
					
					System.out.println("Do you want to add or remove? 1. for add or 2. for remove");
					Scanner SC = new Scanner(System.in);
					
					int decision = SC.nextInt();
					
					if (decision == 2) {
						
						Scanner index = new Scanner(System.in);
						int indexOfCar = index.nextInt();
						
						System.out.println(" ");
						System.out.println("choose your car by the number of its index.");
						CarOffers.removeMethod(indexOfCar, carLot);
					}
					if(decision == 1) {
						CarOffers.addMethod(carLot);
					}

					break;

				case 3:
					System.out.println(" Do you want to accept or reject this offer? 1.accept/2.reject");

					Scanner sc2 = new Scanner(System.in);
					decision = sc2.nextInt();
						CarOffers.AcceptOrReject(carLot, decision);
					break;

				case 4:
					switchControl2 = false;
				
				

			}
			}
		}

		else if (question == answerCustomer) {
			
			boolean switchControl1 = true;
			
			while (switchControl1) {

			System.out.println("Welcome to M&K's Cars. Below are your main menu options.");
			System.out.println("-----------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Make an offer on a vehicle.");
			System.out.println("3. View cars that I own.");
			System.out.println("4. View remaining payments on cars that I own");
			System.out.println("5. sign out");
			
			int choice = sc.nextInt();
			
			
			double customerOffer = 0;
				
			
				switch (choice) {

				case 1:
					System.out.println(" These are the available cars: ");
					CarOffers.carsOnLot(carLot);
					System.out.println(" ");

				case 2:
					
					System.out.println(" ");
					CarOffers.carsOnLot(carLot);
					System.out.println("Which car do you want to make an offer on?:");
					System.out.println(" ");
					Scanner sc3 = new Scanner(System.in);
					int carChosen = sc3.nextInt();
					System.out.println("this is your car");
					CarOffers.ChosenCar(carLot, carChosen);

					break;

				case 3:

					break;

				case 4:
				
					break;
				
				case 5:
				
					switchControl1 = false;

				}

			}
	 }	
			
		System.out.println(" ");
		System.out.println("Thanks for coming!!!");
		System.out.println(" ");
	}
		
  }
} 