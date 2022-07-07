package javaprogram;
//method overloading : changing data type of argument
public class Addition1 {
	static int add(int a,int b) { //no of argument 2 ,add is a method
		return(a+b);}
	static double add(double a, double b) { //no of argument 2 ,add is a method
		return(a+b);
	}
	class overloading1{//main class
		public static void main(String args[]) {
			System.out.println(Addition.add (10,10));
			System.out.println(Addition.add (10.6,10.5));
		}
	}

}

