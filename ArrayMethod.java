package Hd1;

//returning array from a method
public class ArrayMethod {
	static int[]get(){//method which return an array
		return new int[] {10,20,30};
		
	}
	public static void main(String args[]) {
		int arr[]=get();//calling the same whic
		for(int i=0;i<arr.length;i++)//pint the elements
System.out.println(arr[i]);
		}

}
