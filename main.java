package Menus;

import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		
		// print out the welcome to the site		
		
		System.out.println("Welcome to the site! Below, enter your username and password.");
		System.out.println("-------------------------------------------------------------");
				
		System.out.println(" ");
		System.out.println("Enter Username: ");
		System.out.println("--------------");
		
		//opens up the scanner
		Scanner sc = new Scanner(System.in);
		
		String username = sc.nextLine();
		
		
		System.out.println(" ");
		System.out.println("Enter Password: ");
		System.out.println("---------------");
				
		
		String password = sc.nextLine();
		
		
		
		
		System.out.println("Are you an employee or customer? 1. Employee / 2. Customer");
		System.out.println(" ");
		
		int question = sc.nextInt() ;
		int answerCustomer = 2;
		int answerEmployee = 1;
		
		
		if (question == answerEmployee ) {
			
			System.out.println("Welcome to the employee portal. Choose your options below.");
			System.out.println("---------------------------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Add or remove a car.");
			System.out.println("3. Accept or reject offer.");
			System.out.println("4. ");
		}
		
		else if (question == answerCustomer) {
			
			System.out.println("Welcome to CARS'R US. Below are your main menu options.");
			System.out.println("-----------------------------------------");
			System.out.println("1. View all cars on the lot.");
			System.out.println("2. Make an offer on a vehicle.");
			System.out.println("3. View cars that I own.");
			System.out.println("4. View remaining payments on cars that I own");
		}
		sc.close();
	} 


}
