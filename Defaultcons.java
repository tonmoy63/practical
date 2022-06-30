package javaprogram;

public class Defaultcons {
private String name;
Defaultcons(){
System.out.println("Cons called");
name = "Tonmoy";
}
   public static void main(String[]args){
Defaultcons obj = new Defaultcons();
System.out.println("The name is " +obj.name);
}
}