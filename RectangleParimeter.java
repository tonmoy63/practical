package javaprogram;

public class RectangleParimeter {
	int length;
	int width;
	void insert(int l, int w) {
		length = l;
		width = w;
		
	}
	void calculatePerimeter() {
		System.out.println((length+width)*2);
	}
	class Rectangle1{
		public static void main(String[]args) {
			RectangleParimeter r1=new RectangleParimeter();
			
		r1.insert(11,5);
		r1. calculatePerimeter();
		}
	}

}
