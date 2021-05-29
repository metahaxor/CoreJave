package com.example.corejava.demo;

import java.io.*;

public class DeserilzableDemo {
	
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("OutputFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee a1 = (Employee) ois.readObject();
		Employee a4 = (Employee) ois.readObject();
		Employee a3 = (Employee) ois.readObject();
		
		ois.close();
		
		System.out.println(a1+" "+a4+" "+a3); 
	}

}
