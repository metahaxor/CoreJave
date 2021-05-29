package com.example.corejava.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilzableDemo {
	
	public static void main (String args[]) throws IOException {
		
		Employee e1 = new Employee("John", 13001l, "IT");
		Employee e2 = new Employee("Frank", 13002l, "DBA");
		Employee e3 = new Employee("Ron", 13003l, "Admin");
		
		FileOutputStream fos = new FileOutputStream("OutputFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		oos.flush();
		oos.close();
	}
	
	

}
