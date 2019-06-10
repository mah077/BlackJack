package com.revature.ui;

import java.util.Iterator;
import java.util.Scanner;

import com.revature.project0.Customer;
import com.revature.project0.Employee;
import com.revature.project0.Person;
import com.revature.project0.SystemCompany;
import com.revature.ui.ScreenCustomer;


public class LogIn {

	char checkchoice;
	private static Scanner input;
	public static Person person=new Person(); 
	public static Employee e =new Employee ();
	Customer c= new Customer();
	public static ScreenCustomer sc=new ScreenCustomer();
	public static ScreenEmployee se=new ScreenEmployee();
	
	public LogIn() {}
	
public void pageoneScreen() {
	
	input = new Scanner(System.in);
	do {
		System.out.println("Please choose the following letters:\n"
				+"press 'y' to login\n"
				+"press 'n' to create an account enter 'n'\n"
				+"press 'e' for exit");
		checkchoice=input.next().charAt(0);			
		switch(checkchoice){	
		case 'y': CheckLogin();	break;
		case 'n': CreateAccount(); break;
		case 'e':System.out.println("You have Exited \n"); 
					SystemCompany.fsd.saveFile(SystemCompany.alot);
		System.exit(1); break;				
		default : System.out.println("Invalid Choice");
		}// end switch			
	}while(checkchoice!='y' && checkchoice!='n' && checkchoice!='e' );
  }	//end method pageoneScreen

private void CreateAccount() {

	input = new Scanner(System.in);
	int id=person.getId();
	int checkUser;
	String checkpass;
	
	System.out.println("WELCOME TO HIAZI CARDEALER COMPANY...:)");
	System.out.println("press '1' for employee Account or press '2' for customer account press '3' for Exit");
	do {
		checkUser=input.nextInt();
		switch(checkUser) {	
		case 1:
			e.setId(id);
			System.out.println("Enter you first name:");
			e.setFname(input.nextLine());
			e.setFname(input.nextLine());
			System.out.println("Enter you last name:");
			e.setLname(input.nextLine());
			do{System.out.println("Enter your email(employee@emp.com):");
			e.setUsername(input.nextLine());}while(!e.getUsername().contains("@emp.com"));
			do{System.out.println("Enter you password:");e.setPassword(input.nextLine());
			System.out.println("re-enter your password:");	checkpass=input.nextLine();
			Employee.listemployee.add(e);System.out.println(Employee.listemployee);
			if(!e.getPassword().equals(checkpass)) System.out.println("Passwords Not matched");			
			}while(!e.getPassword().equals(checkpass));
			
				EmpCheckLogin(); Employee.listemployee.add(e);	 break;
		case 2:
			c.setId(id);
			System.out.println("Enter you first name:");
			c.setFname(input.nextLine());
			c.setFname(input.nextLine());
			System.out.println("Enter you last name:");
			c.setLname(input.nextLine());
			do{System.out.println("Enter your email(customer@cust.com):");
			c.setUsername(input.nextLine());}while(!c.getUsername().contains("@cust.com"));
			
			do{System.out.println("Enter you password:");
			c.setPassword(input.nextLine());
			System.out.println("re-enter your password:");
			checkpass=input.nextLine();
			if(!c.getPassword().equals(checkpass)) System.out.println("Passwords Not matched");			
			}while(!c.getPassword().equals(checkpass));
			Customer.listcustomer.add(c); CustCheckLogin();	Customer.listcustomer.add(c); break;		
		case 3:System.out.println("You have Exited");
				break;
		
		default : System.out.println("Invalid choise");		}
	}while(checkUser!=1 && checkUser!=2 && checkUser!=3);	
}// end method create account

private void CheckLogin() {
	input = new Scanner(System.in);
	int checkans;
	System.out.println("Welocome Back\nPress '1' if you are an employee - press '2' if you are customer press '3' key to exit");
	do{checkans=input.nextInt();
	
	switch(checkans) {
	case 1: EmpCheckLogin();	break;	
	case 2:  CustCheckLogin();	break;	
	case 3: System.out.println("You are Exited");  System.exit(1);	break;	
	default: System.out.println("Invalid choice\nPress '1' if you are an employee - press '2'"
			+ " if you are customer press '3' key to exit\");");	}
	
	}while(checkans!=1 && checkans!=2&& checkans!=3);
	
	System.out.println("Thank you for visiting");
}// end method check in
	
public void EmpCheckLogin() {
	input = new Scanner(System.in);
	System.out.println("Employee Login Page");
	String email;	String pass;	int i=0;   int flag=2;	int flag1=2;
    
   do { i++; if(i==4) pageoneScreen();
	Iterator<Person> iter = e.getlist().iterator(); 
	Iterator<Person> iter1 = e.getlist().iterator(); 
    System.out.println("Email: ");
	email=input.nextLine(); 
	System.out.println("Passowrd");
    pass=input.nextLine();
			/*
			 * if((!e.getUsername().equals(email)) && !(e.getPassword().equals(pass)))
			 * System.out.println("Invalid Username or Pass");
			 */
    while(iter1.hasNext()) {
				if ((!iter1.next().getUsername().equals(email))) 
					flag = 2;			
    	else 	flag =1; }
    		while(iter.hasNext()) {
    			
				if ((!iter.next().getPassword().equals(pass))) 
					flag1 = 2;
					
    	    	else  flag1 =1; 	}  
    	    	System.out.println(flag+" "+flag1);
    				}while( flag ==2 || flag1==2 );
   
        se.choosechoice();// go to employee screen
}// end method employee log in

public void CustCheckLogin() {
	System.out.println("Customer Login Page");
	input = new Scanner(System.in);
	String email;
	String pass;
	int i=0;
	int flag=2;
	int flag1=2;
	
   do { i++;  if(i==3) pageoneScreen();
	Iterator<Customer> iter = c.getList().iterator(); 
	Iterator<Customer> iter1 = c.getList().iterator(); 
    System.out.println("Email: ");	 email=input.nextLine(); 
	System.out.println("Passowrd");  pass=input.nextLine();
			/*
			 * if((!c.getUsername().equals(email)) && !(c.getPassword().equals(pass)))
			 * System.out.println("Invalid Username or Passwod.");
			 */
    		 
    while(iter1.hasNext()) {
				if ((!iter1.next().getUsername().equals(email))) 
					flag = 2; 
					
    	else flag =1; }
    		while(iter.hasNext()) {
				if ((!iter.next().getPassword().equals(pass))) 
					flag1 = 2;
					
    	    	else flag1 =1; }
    		  		}while( flag ==2 || flag1==2 );
	sc.choosechoice();// go to customer screen
	}
}// end method customer log in