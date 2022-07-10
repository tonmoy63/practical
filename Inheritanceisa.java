package javaprogram;

public class Inheritanceisa {
float salary= 5000;

}
class Inherit extends Inheritanceisa {
	int bonus = 4000;
	public static void main(String args []) {
		Inherit i = new Inherit();
		System.out.println("salary is:"+i.salary);
		System.out.println("bonus is:"+i.salary);
	}
}
