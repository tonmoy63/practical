package javaprogram;

public class Staticvariable { //class 1
	int rollno;
	String name;
	static String college = "IMPS";
	//constructor
	Staticvariable(int r, String n){
		rollno =r;
		name= n;
		
	}//method
	void display() {
		System.out.println(rollno + "" +name + "" + college);
	}
	public class Staticvariable1{//class 2
		public static void main(String[]args) {
			//object
			Staticvariable s1= new Staticvariable(7003, "Tonmoy");
			Staticvariable s2= new Staticvariable(7004, "Halder");
			s1.display();
			s2.display();
		}
	}
}
