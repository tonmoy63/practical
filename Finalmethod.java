package javaprogram;

public class Finalmethod {
public final void display() {
	System.out.println("This is final method");
}}
class main extends Finalmethod{
	public void display() {
		System.out.println("This  final method is ovverideen");

}
	public static void main(String args[]) {
		main a= new main();
		a.display();
	}
}
