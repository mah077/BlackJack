package com.revature.project0;

import java.util.ArrayList;
import java.util.List;

public class Cars  {

	public Cars(String model, String make, int carID) {
		super();
		this.model = model;
		this.make = make;
		this.carID = carID;	
	}
	
	public Cars() {}

	private String model;
	private String make;
	private  int carID;
	
	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}
	private List<Double> offer = new ArrayList<Double>();//list of offers
	
	
	
	public void setOffer(List<Double> offer) {
		this.offer = offer;
	}

	
	public List<Double> getOffer(){
		
		return offer;
		
		
	}	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Cars [model=" + model + ", make=" + make + ", carID=" + carID +"]";
	}
	
	
	
	
	
	
	
}
