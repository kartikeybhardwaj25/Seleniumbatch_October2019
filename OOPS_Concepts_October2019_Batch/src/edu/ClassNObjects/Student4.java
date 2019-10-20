package edu.ClassNObjects;
//parameterized constructor
public class Student4 {

	//define fields
	int id;
	String name;
	
	//parameterized constructor
	Student4(int i,String n){
		id =i;
		name =n;
	}
	
	//method to display value
	
	void display() {
		System.out.println(id+ " "+name);
	}
	public static void main(String[] args) {
		
		//create an Object or instance and pass values
		Student4 s1 = new Student4(111,"Tom"); //Student object
		Student4 s2 = new Student4(112,"Sam"); //Student object
		
		s1.display();
		s2.display();
		

	}

}
