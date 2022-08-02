package com.kogent;

public class StringExample {
	public void show() {
		char[]arr= {'j','a','v','a'};
		String s =new String(arr);
		System.out.println("the value is: " +s);
		System.out.println(arr);
	}
	public void myfunction() {
		String n="Tonmoy";
		String n1="Tonmoy";
		String n2=new String("Tonmoy");
		
	}
	public static void main(String[]args) {
		StringExample obj=new StringExample();
		obj.show();
		obj.myfunction();
	}

}
