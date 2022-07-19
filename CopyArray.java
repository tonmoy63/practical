package Hd1;

public class CopyArray {
	 public static void main(String[] args) {  
	        //declaring a source array  
	        char[] copyFrom = { 'd', 'e', 'T', 'O', 'N', 'M', 'O',  
	                'Y', 'n', 'a', 't', 'e', 'd' };  
	        //declaring a destination array  
	        char[] copyTo = new char[6];  
	        //copying array using System.arraycopy() method  
	        System.arraycopy(copyFrom, 2, copyTo, 0, 6);  
	        //printing the destination array  
	        System.out.println(String.valueOf(copyTo));  
	    }

}
