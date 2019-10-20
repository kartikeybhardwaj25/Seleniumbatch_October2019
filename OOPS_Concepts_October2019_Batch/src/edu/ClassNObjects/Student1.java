package edu.ClassNObjects;

public class Student1 {
	int id;
	String name;
	
	void insertrecord(int r ,String n) {
		
		id =r;
		name =n;
		
	}
	
	void displayinformation() {
		System.out.println(id+ " "+name);
	}

}
