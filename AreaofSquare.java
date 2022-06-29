package javaprogram;

public class AreaofSquare {
	int length;
	void insert(int l) {
		length = l;
	}
	void calculateArea () {
		System.out.println(length*length);
	}
	class Square1{
		public static void main(String[]args) {
			AreaofSquare r1=new AreaofSquare();	
		r1.insert(11);
		r1.calculateArea();
		}
	}

}


