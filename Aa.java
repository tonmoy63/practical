package Hd1;
//12.07.22
public interface Aa {
void a ();
void b ();
void c ();
void d ();

}
abstract class Abc implements Aa{
	public void c(){
	System.out.println("c");
	
}}
class hello extends Abc{
	public void a() {
		System.out.println("a");
	}
	public void b() {
		System.out.println("b");
}
	public void d() {
		System.out.println("d");
	}}
class Test5{
	public static void main(String args[]) {
		hello obj = new hello();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}