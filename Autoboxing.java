package Wrapper;
//primitive to wrapper 22.07.22
public class Autoboxing {
     public static void main(String args[]) {
    	 int a=10;
    	 Integer i= Integer.valueOf(a);//converting int into integer
    	 Integer j =a;//now compiler will write Integer.valueOfautoboxing

System.out.println(a+" "+i+" "+j);
     }
}
