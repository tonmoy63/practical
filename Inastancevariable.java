package javaprogram;

public class Inastancevariable {
	int rollno;
	String name;
    float fee;
	//constructor
    Inastancevariable(int rollno, String name,float fee){
		this.rollno =rollno; // if 'rollno=rollno' then programe is not executed
		this.name= name; //bcz parameter and variables are same
		this.fee=fee; //so we need 'this' keyword
		
	}//method
	void display() {
		System.out.println(rollno + " " +name + " " + fee);
	}
	public class Inastancevariable1{//class 2
		public static void main(String[]args) {
			//object
			Inastancevariable s1= new Inastancevariable(7003, "Tonmoy",5000);
			Inastancevariable s2= new Inastancevariable(7004, "Halder",7000);
			s1.display();
			s2.display();
		}
	}
}


