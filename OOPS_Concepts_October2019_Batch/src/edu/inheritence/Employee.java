package edu.inheritence;

class Employee {
	float salary =40000;
}

class Programmer  extends Employee{
	int bonus = 20000;
	
public static void main(String[] args) {
	Programmer P1 = new Programmer();
	
	System.out.println("Programmer salary is"+P1.salary);
	System.out.println("Programmer salary is"+P1.bonus);

	}

}
