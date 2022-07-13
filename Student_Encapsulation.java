package Hd1;
//encapsulation
public class Student_Encapsulation {
private String name;//private data member
public String getName() {//gettervmethod for name
  return name;
}
public void setName(String name) {//setter method 
	this.name=name;
}}
class Test_encapsulation {
public static void main(String args[]) {
	Student_Encapsulation obj = new Student_Encapsulation ();
	obj.setName("Tonmoy");//setting the value
	System.out.println(obj.getName());
}
}