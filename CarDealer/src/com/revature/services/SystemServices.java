package com.revature.services;

import com.revature.project0.SystemCompany;

public interface SystemServices {

	public void SaveDatainFile(); //todo fix camel casing	
	public double CalculateMonthlyPayment(double d,SystemCompany s);	
	public void RejectPending(SystemCompany s);
	
	
	
}
