package com.revature.project0;

public class Person {

	private static  int id=1000; //todo why static id
	private String fname;
	private String lname;
	private String username;
	private String Password;
	
	
	public Person(int id, String fname, String lname, String username, String password) {
		super();
		Person.id = id;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.Password=password;
		id++;
	}

	public Person() {}

	public int getID()
	{ return id;}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		Person.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fname=" + fname + ", lname=" + lname + ", username=" + username + ", Password="
				+ Password + "]";
	}

	
	

	
	
	
	
	
	
	
	
	
	
	
}
