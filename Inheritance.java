package javaprogram;

public class Inheritance {
	void eat(){
		System.out.println("eating");}  
}
	class Dog extends Inheritance{  
	void bark(){
		System.out.println("barking");}  
	}
	class BabyDog extends Dog{  
	void weep(){
		System.out.println("weeping");}  
	}
	class Animal{  
	public static void main(String args[]){  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}} 

