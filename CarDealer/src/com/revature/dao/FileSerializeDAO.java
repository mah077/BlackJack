package com.revature.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.revature.project0.Lot;



public class FileSerializeDAO implements FileDAO {

	
	private static final String FILENAME = "myCarsfile.dat";
	
	@Override
	public void saveFile(Lot f) {
		ObjectOutputStream oos = null;
		FileOutputStream foo = null;
		
		try {
			foo = new FileOutputStream(FILENAME);
			oos = new ObjectOutputStream(foo);
			oos.writeObject(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {
			
			}
			try {
				if (foo != null) foo.close();
			} catch (IOException e) {
				
			}
		}
		
	}


	@Override
	public Lot loadFile() {
	Lot ret = null;
		
		//try with resources
		try (FileInputStream fis = new FileInputStream(FILENAME);
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			
			ret = (Lot) ois.readObject();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		} catch (ClassNotFoundException e) {
			
		}
		
		return ret;
	}

}
