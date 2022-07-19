package Hd1;

import java.util.Scanner;
public class Arrayeven {
	  public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.println("enter array length:");
				int arrLength=s.nextInt();
				int []anArray=new int [arrLength];
				System.out.println("enter the elements:");
				
				for(int i=0;i<arrLength;i++) {
			
			anArray[i]=s.nextInt();
		}
	        System.out.print("Even numbers:");
	        for(int i = 0 ; i < arrLength ; i++)
	        {
	            if(anArray[i] % 2 == 0)
	            {
	                System.out.print(anArray[i]+" ");
	            }
	        }

}}