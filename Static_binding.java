package Hd1;

public class Static_binding {
	private void run () {
		System.out.println("Method is private");
	}
	public static void main(String args[]) {
		Static_binding obj = new Static_binding ();
		obj.run();
	}
}
