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
		
		//CarDAOImpl cardaoimpl = new CarDAOImpl();
		
		
		  //try { cardaoimpl.addCar("Toyota", "Tundra", 2018, "Blue", 30000); }
		//  catch(SQLException e) { e.printStackTrace(); }
		 
		
		
		//  try { System.out.println(cardaoimpl.getCars()); } catch(SQLException e) {
		//  e.printStackTrace(); }
		 
		

		
		// * prompt the welcome menu and ask the user
		// * for their username and password.
		 
		List<Car> carLot = new ArrayList<Car>();

		
		  carLot.add(new Car("Toyota", "Camry", 2000, "Red", 60000));
		  
		  carLot.add(new Car("Nissan", "Hootie", 2103, "Blue", 45000));
		  
		  carLot.add(new Car("Toyota", "Avalon", 2014, "Yellow", 50000));
		 
		
		List<Car> customerLot = new ArrayList<Car>();
		
		boolean signedIn = true;
		while(signedIn) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("Welcome to the site! Below, enter your Username and Password.");
		System.out.println("-------------------------------------------------------------");
		
		
		System.out.println("---------------");
		System.out.println("Enter Username: ");
		System.out.println("---------------");
		
		
		//opens up the scanner for user input
		Scanner sc = new Scanner(System.in);
		
		String username = sc.nextLine();
		//String username1 = "Lakendrick26";

		
		System.out.println("---------------");
		System.out.println("Enter Password: ");
		System.out.println("---------------");	
		
		
		String password = sc.nextLine();

		// Asks the user if their an employee or customer.
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Are you an Employee or Customer? 1.for Employee and 2. for Customer");
		System.out.println("-------------------------------------------------------------------");

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

			System.out.println("---------------------------------------------------------------");
			System.out.println("Welcome to the Employee Portal. Choose from your options below.");
			System.out.println("---------------------------------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Add or remove a car.");
			System.out.println("3. Accept or reject offer.");
			System.out.println("4. Sign out.");
			System.out.println("----------------------------");

			// This is used to access the options on the employee menu.
			
			int choice = sc.nextInt();
			
			
				switch (choice) {

				case 1:
					System.out.println("-----------------");
					System.out.println(" Available Cars: ");
					System.out.println("-----------------");
					
					//for (int i = 0; i < cardaoimpl.getCars().size(); i++) {
					//	System.out.println(cardaoimpl.getCars().get(i));
				//	}
					  //try { System.out.println(cardaoimpl.getCars()); } catch(SQLException e) {
					  //e.printStackTrace(); }
					 
					
					CarOffers.carsOnLot(carLot);
					System.out.println(" ");
					break;

				case 2:
					
					System.out.println("----------------------------------------------------");
					System.out.println("Would you like to Add or Remove? 1. Add or 2. Remove ");
					System.out.println("----------------------------------------------------");
					
					Scanner SC = new Scanner(System.in);
					
					int decision = SC.nextInt();
					
					if (decision == 2) {
						
						
						//for (int i = 0; i < cardaoimpl.getCars().size(); i++) {
						//	System.out.println(cardaoimpl.getCars().get(i));
						//}
						
						CarOffers.carsOnLot(carLot);
						System.out.println("-----------------------------------------");
						System.out.println("Choose your car by index. (starts from 0)");
						System.out.println("-----------------------------------------");
						
						Scanner index = new Scanner(System.in);
						
						int indexOfCar = index.nextInt();
						
						System.out.println("-----------");
						System.out.println("Car Removed");
						System.out.println("-----------");
						
						//try {
						//	CarDAOImpl.removeCar(indexOfCar);
						//} catch (SQLException e) {
							// TODO Auto-generated catch block
						//	e.printStackTrace();
					//	}
						CarOffers.ChosenCar(carLot, indexOfCar);
						//CarOffers.SystemUpdateOwnership(carLot, customerLot, customerOffer);
						CarOffers.removeMethod(indexOfCar, carLot);
						
					}
					if(decision == 1) {
						

							/*
							 * Scanner scan = new Scanner(System.in);
							 * 
							 * System.out.println("-----"); System.out.println("Make: ");
							 * System.out.println("-----");
							 * 
							 * String make = scan.nextLine();
							 * 
							 * System.out.println("------"); System.out.println("Model: ");
							 * System.out.println("------");
							 * 
							 * String model = scan.nextLine();
							 * 
							 * System.out.println("------"); System.out.println("Color: ");
							 * System.out.println("------");
							 * 
							 * String color = scan.nextLine();
							 * 
							 * System.out.println("----------"); System.out.println("Year Made: ");
							 * System.out.println("----------");
							 * 
							 * int year = scan.nextInt();
							 * 
							 * System.out.println("------"); System.out.println("Price: ");
							 * System.out.println("------"); double price = scan.nextDouble();
							 */
						
						//try { cardaoimpl.addCar(make, model, year, color, price); }
						// catch(SQLException e) { e.printStackTrace(); }
						 
						CarOffers.addMethod(carLot);
					}

					break;

				case 3:
					System.out.println("----------------------");
					System.out.println("Customers offer on Car:");
					System.out.println("----------------------");
					
					System.out.println(customerOffer);
					CarOffers.ChosenCar(carLot, customerOffer);
					
					System.out.println("--------------------------------------------------------------");
					System.out.println(" Do you want to accept or reject this offer? 1.Accept/2.Reject");
					System.out.println("--------------------------------------------------------------");

					Scanner sc2 = new Scanner(System.in);
					
					decision = sc2.nextInt();
					if(decision == 1) {
						CarOffers.AcceptOrReject(carLot, customerOffer );
						CarOffers.SystemUpdateOwnership(carLot, customerLot, customerOffer);
						CarOffers.removeMethod(customerOffer, carLot);
					}
					else if (decision == 2) {
						System.out.println("-----------------------");
						System.out.println("Offer on car rejected: ");
						System.out.println("-----------------------");
						
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

			System.out.println("--------------------------------------------------------");
			System.out.println("Welcome to M&K's Cars. Below are your main menu options.");
			System.out.println("--------------------------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Make an offer on a vehicle.");
			System.out.println("3. View cars that I own.");
			System.out.println("4. Sign out");
			
			
			int choice = sc.nextInt();
			
			
			
				
			
				switch (choice) {

				case 1:
					System.out.println("-----------------");
					System.out.println(" Available cars: ");
					System.out.println("------------------");
					
					//System.out.println(" These are the available cars: ");
					
				//	for (int i = 0; i < cardaoimpl.getCars().size(); i++) {
						
					//	System.out.println( cardaoimpl.getCars().get(i));
					//}
					
					CarOffers.carsOnLot(carLot);
					System.out.println(" ");
					break;
				case 2:
					
					System.out.println(" ");
				//	for (int i = 0; i < cardaoimpl.getCars().size(); i++) {
					//	System.out.println(cardaoimpl.getCars().get(i));
				//	}
					//CarOffers.carsOnLot(carLot);
					System.out.println("----------------------------------------");
					System.out.println(" Choose your car by the ID from the List");
					System.out.println("----------------------------------------");
					CarOffers.carsOnLot(carLot);
					Scanner sc3 = new Scanner(System.in);
					int carChosen = sc3.nextInt();
					//System.out.println("Customer chosen car");
						/*
						 * try { CarDAOImpl.chosenCar(carChosen); } catch (SQLException e) { // TODO
						 * Auto-generated catch block e.printStackTrace(); }
						 */
					CarOffers.ChosenCar(carLot, carChosen);
					System.out.println("---------------------------------");
					System.out.println("What is your desired downpayment?");
					System.out.println("---------------------------------");
					double downPayment = sc3.nextDouble();
					System.out.println("--------------------------------------------");
					System.out.println("How many months do you wish your loan to be?");
					System.out.println("--------------------------------------------");
					int months = sc3.nextInt();
					CarOffers.CalculatePayments(carLot, carChosen, downPayment, months);
					System.out.println(" ");
					//try {
					//	customerOffer = CarDAOImpl.chosenCar(carChosen);
					//} catch (SQLException e) {
						// TODO Auto-generated catch block
					//	e.printStackTrace();
					//}
					 customerOffer = CarOffers.ChosenCar(carLot,carChosen);
					
					 
					 break;
				case 3:
					System.out.println("--------------");
					System.out.println(" Cars you Own: ");
					System.out.println("--------------");
					CarOffers.carsOnLot(customerLot);
				
					break;
				
				case 4:
				
					switchControl1 = false;

			}
		}
	 }
			
		System.out.println("--------------------");
		System.out.println("Thanks for Coming!!!");
		System.out.println("--------------------");
			}
		}
	}

