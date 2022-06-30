package javaprogram;

public class AreaOfRectangle {
	int length;
	int width;
	void insert(int l, int w) {
		length = l;
		width = w;
		
	}
	void calculateArea() {
		System.out.println(length*width);
	}
	class Rectangle1{
		public static void main(String[]args) {
			AreaOfRectangle r1=new AreaOfRectangle();
			
		r1.insert(11,5);
		r1. calculateArea();
		}
	}

}


