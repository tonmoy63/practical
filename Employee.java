package javaprogram;

public class Employee {
	float salary= 5000;

	}
	class abc extends Employee {
		int bonus = 4000;
		public static void main(String args []) {
			abc i = new abc();
			System.out.println("salary is:"+i.salary);
			System.out.println("bonus is:"+i.salary);
		}
	}


