package edu.ClassNObjects;

public class TestStudent2 {

	public static void main(String[] args) {
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		
		s2.id = 101;
		s2.name = "mark";
		
		s3.id= 202;
		s3.name="Harry";
		
		System.out.println(s2.id+" "+s2.name); //printing members with white spaces
		System.out.println(s3.id+" "+s3.name); //printing members with white spaces
	}

}
