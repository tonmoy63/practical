package Hd1;

public class Dynamic_binding {
void run () {
	System.out.println("Method is not private");
}
}
class test3 extends Dynamic_binding{
	void run() {
		System.out.println("Method implimentation changed");
	}

public static void main(String args[]) {
	test3 obj=new test3();
	obj.run();
}}
