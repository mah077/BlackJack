package com.revature.project0;


import java.io.IOException;

import com.revature.dao.FileSerializeDAO;
import com.revature.ui.LogIn;

public class SystemCompany   {
	// private static final String FILE_PATH="C:\\Users\\Mohamad Hijazi\\Desktop\\javatest.txt";
	 public static Cars cars=new Cars();
     public static Lot alot= new Lot();
     public static Person employee = new Employee();
 	 public static Customer customer=new Customer();
 	 public static FileSerializeDAO fsd= new FileSerializeDAO();
 
	
	public static void main(String[] args)  throws IOException {
		if(fsd.loadFile()==null) {			alot= new Lot();		}else
		{		alot=fsd.loadFile();		}
		
		
		
		//Main Employee
		employee.setId(101); 
		employee.setFname("Mohamad");
		employee.setLname("Hijazi");
		employee.setUsername("mohamad@emp.com");
		employee.setPassword("123");	
		Employee.listemployee.add(employee);
		System.out.println(employee.toString());	
	    //Default customer
		customer.setId(101);
		customer.setFname("John");
		customer.setLname("Tree");
		customer.setUsername("john@cust.com");
		customer.setPassword("123");	
		Customer.listcustomer.add(customer);
		System.out.println(customer.toString());
		//Fill the Lot
		alot.AddCar(new Cars("BMW","Blue",2001));
		alot.AddCar(new Cars("AUDI","Black",2002));
		alot.AddCar(new Cars("TOYOTA","Red",2003));
		alot.AddCar(new Cars("MAZDA","Yello",2004));
		alot.AddCar(new Cars("TRUK","Gray",2005));
		alot.AddCar(new Cars("LAMBO","White",2006));
			
		alot.ViewCars();
		
		/*
		 * try { FileOutputStream fileout=new FileOutputStream(FILE_PATH);
		 * ObjectOutputStream objectout=new ObjectOutputStream(fileout);
		 * objectout.writeObject(cars); objectout.close();
		 * 
		 * 
		 * }catch(Exception e) {e.printStackTrace();}
		 */
		
		
		LogIn l = new LogIn();
		l.pageoneScreen();
		
		
		
		
	}
	
	
}
