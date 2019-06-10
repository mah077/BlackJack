package com.revature.project0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.revature.project0.Cars;
import com.revature.services.LotService;

public class Lot extends Cars implements LotService,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// list of cars plus the offer
	public static List<Cars> listcars= new ArrayList<Cars>(); 
	private static int offerAmount;
	private static int OfferIDCar;
	private static char offerResult;
	
	
	
	
	
	public Lot() {
		super();
	
	}
	public Lot(String model, String make, int carID) {
		super(model, make, carID);
		
	}
	
	
	public int getOfferIDCar() {
		return OfferIDCar;
	}
	public void setOfferIDCar(int offerIDCar) {
		OfferIDCar = offerIDCar;
	}
	public int getOfferAmount() {
		return offerAmount;
	}
	public void setOfferAmount(int offerAmount) {
		Lot.offerAmount = offerAmount;
	}
	public List<Cars> getCars(){
	
		return listcars;
		
	}
	@Override
	public void removeCar(int i) {

		Iterator<Cars> id = listcars.iterator();
		while(id.hasNext()) {
			if(id.next().getCarID()==i)
	 			id.remove();
		}

  }
	@Override
	public void view1car(int i) {
		Iterator<Cars> itr = listcars.iterator();
		while(itr.hasNext()) {
			Cars c=itr.next();
			if(c.getCarID()==i) {
			System.out.println("Your Car Is : "+c); }
			else {System.out.println("You Dont have any car here..");
			}
		}	
	}

	@Override
	public void AddCar(Cars c) {
		
		Lot.listcars.add(c);
	}

	@Override
	public void ViewCars() {
	
		
		String output = "";

		for (Cars ca : Lot.listcars) {

			output += ca.toString() + "\n";
		}
		
		System.out.println(output);
		
	}

	public char getOfferResult() {
		return offerResult;
	}
	public void setOfferResult(char offerResult) {
		Lot.offerResult = offerResult;
	}
	
	
	
	
}
