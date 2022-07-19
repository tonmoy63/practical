package Hd1;
// 19.07.22
public class ClassNameArray {
	public static void main(String args[]){

		int arr[]={1,2,3};//declaring and initializing of an array

		Class c=arr.getClass();//getting the class name
		String name=c.getName();

		System.out.println(name);

		}
}
