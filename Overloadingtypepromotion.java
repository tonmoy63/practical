package javaprogram;

public class Overloadingtypepromotion {
	void add(int a,long b) {
		System.out.println(a+b);}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);}
	public static void main (String args[]) {
		Overloadingtypepromotion obj = new Overloadingtypepromotion();
	obj.add(20,30);
	obj.add(20,30,40);
	}
	

}
