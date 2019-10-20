package edu.ClassNObjects;
//Default constructor
public class Student {

	//define fields
	int id;
	String name;
	public static void main(String[] args) {
		
		//create an Object or instance
		Student s1 = new Student(); //Student object
		
		//print value of the object
		System.out.println(s1.id); //access member through reference variable
		System.out.print(s1.name);

	}

}
