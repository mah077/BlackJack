package com.revature.ui;

import java.util.Scanner;

import com.revature.project0.Cars;
import com.revature.project0.Lot;

public class ScreenEmployee {
	
	private static ScreenCustomer sc= new ScreenCustomer();
	private static char choice;
	private static Scanner input;
	private static Lot lot = new Lot (); 
	public static LogIn li=new LogIn ();
	
	public void choosechoice() {
		
		 input= new Scanner(System.in);
		 System.out.println("Employee Side");
		 do {	 System.out.println("Please choose one of the following\n"
		 		+ "Case 1: view Cars"
		 		+ "\nCase 2: Add Car"
		 		+ "\nCase 3: Remove Car"
		 		+ "\nCase 4: view Offer"
		 		+ "\nCase 5: go to customer side"
		 		+ "\nCase 6: Exit"
		 		+ "\nEnter you choise: ");
		 
		choice=input.next().charAt(0);
		 
		 switch(choice) {
		 
		 
		case '1' : viewCars(); break;
			
		case '2' : addCar(); break;
			
		case '3' : removeCar(); break;
			
		case '4' : viewtOffer(); break;
		
		case '5' : sc.choosechoice(); break;
			
		case '6' : System.out.println("You have Exited"); li.pageoneScreen(); break;
			
		default: System.out.println("ivalid choice");
		 }						 
		 }while(choice!='1' && choice!='2' && choice!='3' && choice!='4' && choice!='5' && choice!='6' );
		 
		 
		
	
	
	
	}

	public void viewtOffer() {
		sc.OfferlogIn();
	}
	
	public void OfferlogIn()
	{
	
		System.out.println("Log in please [employee]:");
		li.EmpCheckLogin();
		System.out.println("Customer Side.....");
		acceptOffer1();
		
	}
	
	public void acceptOffer1() {
		input= new Scanner(System.in); 
		System.out.println("The customer Choose the Car ID: "+lot.getOfferIDCar()
				+ " and his offer is: "+lot.getOfferAmount());
		System.out.println("Do you accept this Offer? 'y' or 'n' ");
		char in=input.next().charAt(0);
		lot.setOfferResult(in);
		choosechoice();
	
	}
	
	private void removeCar() {
		System.out.println("Enter Car ID to remove it..");
		 input= new Scanner(System.in);	
		 int i=input.nextInt();
		 lot.removeCar(i);
		 choosechoice();
		
	}

	private void addCar() {
		 input= new Scanner(System.in);
		 String type;String color;int id;
		 System.out.println("Enter Type, Color, and ID");
		 type=input.nextLine();
		 color=input.nextLine();
		 id=input.nextInt();
		 lot.AddCar(new Cars(type,color,id));
		 choosechoice();
	}

	private void viewCars() {
		lot.ViewCars();
		 choosechoice();
		
	}
	
	
}