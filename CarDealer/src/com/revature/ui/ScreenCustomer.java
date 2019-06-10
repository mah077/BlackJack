package com.revature.ui;

import java.util.Scanner;
import com.revature.project0.Lot;

public class ScreenCustomer {

	private static ScreenEmployee se=new ScreenEmployee();
	public static char choice;
	public static Scanner input;
	public static Lot lot= new Lot();
	public static LogIn li=new LogIn ();
	
	public void choosechoice() {

	 input= new Scanner(System.in);
		 System.out.println("Customer Side");
		 do {	 System.out.println("Please choose one of the following\n"
		 		+ "Case 1: view Cars"
		 		+ "\nCase 2: Make Offer"
		 		+ "\nCase 3: View your Car"
		 		+ "\nCase 4: view offer result"
		 		+ "\nCase 5: Go to employee side"
		 		+ "\nCase 6: Exit"
		 		+ "\nEnter you choice: ");
		 
		choice=input.next().charAt(0);
		 
		 switch(choice) {
		 
		 
		case '1' : viewCars(); break;
			
		case '2' : MakeOffer(); break;
			
		case '3' : viewyourCar(); break;
		
		case '4': offerResult(); break;
		
		case '5': se.choosechoice(); break;
			
		case '6' : System.out.println("You have Exited"); li.pageoneScreen(); break;
			
		default: System.out.println("ivalid choice");
		 }						 
		 }while(choice!='1' && choice!='2' && choice!='3' && choice!='4'  );
	}

	private void offerResult() {
		if(lot.getOfferResult()=='y') {  System.out.println("CONGRADS.... you take the Offer");} 
		else if(lot.getOfferResult()=='n') {  System.out.println("Sorry you offer has been REJECTED");}
		else System.out.println("Pending.....");
		choosechoice();
		
	}

	private void viewyourCar() {
		 input= new Scanner(System.in);
		 System.out.println("Enter you car ID");
		 int i=input.nextInt();
		 lot.view1car(i);
		 choosechoice();
		
	}
	public void OfferlogIn()
	{
		input= new Scanner(System.in);
		 System.out.println("Log in please [Customer]:");
		 li.CustCheckLogin();
		MakeOffer();
	}
	
	
	public void MakeOffer() {
		 input= new Scanner(System.in);
		
		 System.out.println("Please enter the ID of the Car and Your Offer");
		 int x=input.nextInt();
		 int y=input.nextInt();
		lot.setOfferIDCar(x);
		lot.setOfferAmount(y);
		se.acceptOffer1();
		
	}

	private void viewCars() {
		lot.ViewCars();
		 choosechoice();
	}
	
}
