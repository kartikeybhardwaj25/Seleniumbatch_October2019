package edu.ClassNObjects;

public class TestStudent3 {

	public static void main(String[] args) {
		Student1 s4 = new Student1();
		Student1 s5 = new Student1();
		
		s4.insertrecord(313, "ABC");
		s5.insertrecord(413, "Tom");
		
		s4.displayinformation();
		s5.displayinformation();

	}

}
