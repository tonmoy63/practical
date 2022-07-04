package javaprogram;

public class StaticMethod {
	int rollno;
	String name;
	static String college = "IMPS";
	static void change() {
		college="IEM";
	}
	StaticMethod(int r,String n){
	rollno=r;
	name=n;
	
		
	} //method
	void display() {
	System.out.println(rollno+""+name+""+college);
	}
	public class StaticMethod1{ //class 2
		public static void main(String[]args) {
			StaticMethod.change();
			//object
			StaticMethod s1= new StaticMethod(7003, "Tonmoy");
			StaticMethod s2= new StaticMethod(7004, "Halder");
			s1.display();
			s2.display();
		}
	}
}

