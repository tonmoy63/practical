package javaprogram;

public class Aggregation {//class 1
int Squre(int n) {
	return n*n;
	
}
}
class circle{//class 2
	Aggregation ag;//obj (entity ref)
	double pi=3.14;
	double area (int radius) {
		ag = new Aggregation();
		int psqure = ag.Squre(radius);
		return pi*psqure;
	}
	public static void main (String[]args) {
		circle c = new circle();
		double result = c.area(5);
		System.out.println(result);
	}
}
