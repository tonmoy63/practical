package Hd1;

public class Datamember {
int carspeed=30;
}
class car extends Datamember{
	int carspeed=60;
	public static void main(String args[]) {
		car obj = new car();
		System.out.println(obj.carspeed);
	}
}
