package com.revature.project0;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person{

	public static List<Customer> listcustomer= new ArrayList<>();
	
	public List<Customer> getList(){
		
		return listcustomer;
	}
		
	public Customer(int id, String fname, String lname, String username, String password) {//todo why do we need customer? access metods?
		super(id, fname, lname, username, password);
		
	}

	public Customer() {	super();}
	
	public void viewCar() {
		
		SystemCompany.alot.ViewCars();
	}


	@Override
	public String toString() {
		return "Customer [getPassword()=" + getPassword() + ", getId()=" + getId() + ", getFname()=" + getFname()
				+ ", getLname()=" + getLname() + ", getUsername()=" + getUsername() + "]";
	}
	
	public void PrintListofCust() {
		String output="";
		for(Person p:Customer.listcustomer)
		{
			output += p.toString() + "\n";
		}
		
		System.out.println(output);			
	}

	
	
	
	
	
	
	
	

	

}
