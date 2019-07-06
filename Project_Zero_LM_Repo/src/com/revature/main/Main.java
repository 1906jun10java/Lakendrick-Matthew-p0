package com.revature.main;

import com.revature.DAOImpl.CarDAOImpl;
import com.revature.beans.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashSet;
import java.util.List;

import com.revature.services.CarOffers;
import com.revature.services.CarOffers.*;

public class Main {

	public static void main(String[] args) {
		
		CarDAOImpl cardaoimpl = new CarDAOImpl();
		
		
		  try { cardaoimpl.addCar("Toyota", "Tundra", 2018, "Blue", 30000); }
		  catch(SQLException e) { e.printStackTrace(); }
		 
		
		/*
		 * try { System.out.println(cardaoimpl.getCars()); } catch(SQLException e) {
		 * e.printStackTrace(); }
		 */
		

	/*	
		 * prompt the welcome menu and ask the user
		 * for their username and password.
		 
		List <Car> carLot = new ArrayList<Car>();

		
		  carLot.add(new Car("Toyota", "camry", 2000, "red", 60000d));
		  
		  carLot.add(new Car("Nissan", "hootie", 2103, "blue", 45000d));
		  
		  carLot.add(new Car("toyota", "Avalon", 2014, "yellow", 50000d));
		 
		
		List<Car> customerLot = new ArrayList<Car>();
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
		//This list is to store the cars that the customer owns
		//List<Car> customerLot = new ArrayList<Car>();
		
		//this will be used to store the index of the car picked by the customer.
		int customerOffer = 0;
		
		//This will be used to store the calculations of the payment
		
		// this will display the employee menu.
		
		if (question == answerEmployee ) {
			//This variable and while loop is used to control the employee menu.
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
						CarOffers.carsOnLot(carLot);
						System.out.println(" ");
						System.out.println("choose your car by the number of its index.");
						Scanner index = new Scanner(System.in);
						int indexOfCar = index.nextInt();
						System.out.println("This is the car to be removed:");
						CarOffers.ChosenCar(carLot, indexOfCar);
						CarOffers.SystemUpdateOwnership(carLot, customerLot, customerOffer);
						CarOffers.removeMethod(indexOfCar, carLot);
						
					}
					if(decision == 1) {
						CarOffers.addMethod(carLot);
					}

					break;

				case 3:
					System.out.println("Customers offer on Car:");
					System.out.println("---------------------");
					CarOffers.ChosenCar(carLot, customerOffer);
					
					System.out.println(" Do you want to accept or reject this offer? 1.accept/2.reject");

					Scanner sc2 = new Scanner(System.in);
					decision = sc2.nextInt();
					if(decision == 1) {
						CarOffers.AcceptOrReject(carLot, customerOffer );
						CarOffers.SystemUpdateOwnership(carLot, customerLot, customerOffer);
						CarOffers.removeMethod(customerOffer, carLot);
					}
					else if (decision == 2) {
						System.out.println("Offer rejected on car: ");
						System.out.println("---------------------");
						System.out.println(" ");
						CarOffers.ChosenCar(carLot, customerOffer);
						
					}
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
			System.out.println("4. sign out");
			
			
			int choice = sc.nextInt();
			
			
			
				
			
				switch (choice) {

				case 1:
					System.out.println(" These are the available cars: ");
					CarOffers.carsOnLot(carLot);
					System.out.println(" ");
					break;
				case 2:
					
					System.out.println(" ");
					CarOffers.carsOnLot(carLot);
					System.out.println("Which car do you want to make an offer on?:");
					System.out.println(" ");
					Scanner sc3 = new Scanner(System.in);
					int carChosen = sc3.nextInt();
					System.out.println("Customer chosen car");
					CarOffers.ChosenCar(carLot, carChosen);
					System.out.println("What is your downpayment?");
					double downPayment = sc3.nextDouble();
					System.out.println("How many months?");
					int months = sc3.nextInt();
					CarOffers.CalculatePayments(carLot, carChosen, downPayment, months);
					System.out.println(" ");
					 customerOffer = CarOffers.ChosenCar(carLot,carChosen);
					 
					 break;
				case 3:
					System.out.println(" Cars you own:");
					System.out.println("---------------");
					System.out.println(" ");
					CarOffers.carsOnLot(customerLot);
				
					break;
				
				case 4:
				
					switchControl1 = false;

				}

			}
	 }	
			
		System.out.println(" ");
		System.out.println("Thanks for coming!!!");
		System.out.println(" ");
	}
		
*/
	}
	
}