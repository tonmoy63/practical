package Hd1;

import java.util.Scanner;

public class ArrayinReverse {
	 public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter array length:");
			int arrLength=s.nextInt();
			int []anArray=new int [arrLength];
			System.out.println("enter the elements:");
			
			for(int i=0;i<arrLength;i++) {
		
		anArray[i]=s.nextInt();
	}
			System.out.println("Array in reverse order: ");  
	      
	        for (int i = arrLength-1; i >= 0; i--) {  
	            System.out.print(anArray[i] + " ");  

}}
}