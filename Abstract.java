package Hd1;

abstract class Abstract {
	 abstract void show();

	}   
	class Circle1 extends Abstract{  
	void show(){
		System.out.println("circle");
		}  
	}  
	class Triangle1 extends Abstract{  
	void show(){
		System.out.println("triangle");
		}  
	}  
	class Test4{  
	public static void main(String args[]){  
	Abstract s;  
	s=new Circle1();  
	s.show();  
	s=new Triangle1();  
	s.show();  
	}  
	
}
