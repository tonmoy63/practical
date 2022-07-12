package Hd1;

public class Animal {
	void eat(){
		System.out.println("Food habit");
		}  
	}  
	class Cow extends Animal{  
	void eat(){
		System.out.println("Food habit :eating Grass");
		}}
	class Dog extends Animal{  
	void eat(){
		System.out.println("Food habit :eating bread");
		}}
	class Tiger extends Animal{  
	void eat(){
		System.out.println("Food habit :eating meat");
		}}
	class Test2{  
	public static void main(String[] args){  
	 
		Animal a=new Cow();  
	a.eat();  
	Animal a1=new Dog();  
	a1.eat();  
	Animal a2=new Tiger();  
	a2.eat();  
	}
}
