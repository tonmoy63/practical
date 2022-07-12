package Hd1;

public class Shape {
	void show(){
		System.out.println("showing");
		}  
	}   
	class Circle extends Shape{  
	void show(){
		System.out.println("circle");
		}  
	}  
	class Triangle extends Shape{  
	void show(){
		System.out.println("triangle");
		}  
	}  
	class Test1{  
	public static void main(String args[]){  
	Shape s;  
	s=new Circle();  
	s.show();  
	s=new Triangle();  
	s.show();  
	}  
	}  

