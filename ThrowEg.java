package Wrapper;

public class ThrowEg {
	public static void Eligible(int age) {
		if (age<18) {
			throw new ArithmeticException("Person is not eligible for vote");
			
		}
		else {
			System.out.println("Person iss eligible for vote");
			
		}
	}
	public static void main(String args[]) {
		Eligible(13);
		System.out.println("rest of the code");
	}
	

}
