package javaprogram;

public class Parameterizedcons {
  String name;
  
  Parameterizedcons(String name1){
	  name = name1;
	System.out.println("Cons called");

	}
	   public static void main(String[]args){
		   Parameterizedcons obj = new Parameterizedcons("Tonmoy");
		   Parameterizedcons obj1 = new Parameterizedcons("Kumar");
		   Parameterizedcons obj2 = new Parameterizedcons("Halder");
	System.out.println("The name is " +obj.name);
	System.out.println("The name is " +obj1.name);
	System.out.println("The name is " +obj2.name);
	}
	}

