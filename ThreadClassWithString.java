package Thread;

public class ThreadClassWithString {
		public static void main(String args[] ){
			Thread obj=new Thread("first thread");
			obj.start();
			String str=obj.getName();
			System.out.println(str);
			
		}
}
