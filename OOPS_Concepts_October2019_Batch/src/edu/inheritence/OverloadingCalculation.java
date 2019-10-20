package edu.inheritence;

public class OverloadingCalculation {
	
	void sum(int a,long b) {
		System.out.println(a+b);
	}
	
	void sum(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		OverloadingCalculation obj1 = new OverloadingCalculation();
		obj1.sum(20, 20);
		obj1.sum(20, 20, 20);
		

	}

}
