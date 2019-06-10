package com.revature.dao;

import com.revature.project0.Lot;

public interface FileDAO {

	public void saveFile(Lot f);
	
	public Lot loadFile();
}
