package edu.inheritence;

abstract class Bike {
	
	Bike(){
		System.out.println("bike is created");
	}
	
	abstract void run();
	
	void changegear() {
		System.out.println("gear changed");
	}

	//creating a child  which inherits abstract
	 class Honda extends Bike{
		 void run() {
			 System.out.println("run safely");
		 }
	 }
	
	 class TestAbstraction2{
	public  void main(String[] args) {
		Bike obj = new Honda();
		obj.run();
		obj.changegear();

	}

}
	 }
