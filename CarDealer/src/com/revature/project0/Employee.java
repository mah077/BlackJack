package com.revature.project0;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person{

	public static List<Person> listemployee= new ArrayList<>(); //todo fix camel casing

	public Employee(int id, String fname, String lname, String username, String password) {//todo why employee ? access methods?
		super(id, fname, lname, username, password);
		}

	public List<Person> getList(){ return listemployee;}
	public Employee()	{super();}
		
	public List<Person> getlist(){	
		return listemployee;		
	}

	public void addCars(Cars c) {
		
	SystemCompany.alot.AddCar(c);			
	}
	
	public void removeCars (int i) {
		
		SystemCompany.alot.removeCar(i);
	}
	
	public void viewCars() {
		
		 SystemCompany.alot.ViewCars();
	}

	@Override
	public String toString() {
		return  "Employee [ID=" + getId() + ", FirstName= " + getFname()
				+ ", LastName=" + getLname() + ", Username=" + getUsername() + 
				" Password=" + getPassword() +  "]";
	}
	
		public void PrintListofEmp() {
			String output="";
			for(Person p:Employee.listemployee)
			{
				output += p.toString() + "\n";
			}
			
			System.out.println(output);			
		}
	
	}
	
	




