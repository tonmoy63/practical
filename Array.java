package Hd1;

public class Array {
     static void max(int arr[]) {
    	 int max = arr[0];
    	 for (int i = 1;i<arr.length;i++)
     if(max<arr[i])
    	 max=arr[i];
       System.out.println(max);
     }
     public static void main(String args[]) {
    	 int a[]= {10,20,30,40,50,70,80};
    	 max(a);
     }
}
