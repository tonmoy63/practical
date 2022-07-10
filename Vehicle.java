package javaprogram;

public class Vehicle {
	void run() {
		System.out.println("Running mode on");
	}}
	class Bike extends Vehicle{
		void run() {
			System.out.println("bike Running mode on");
		}
		public static void main(String args[])
		{
			Bike b = new Bike();
			b. run();
			}
}
