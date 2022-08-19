package Thread;

public class ThreadClassWithRunnableString implements Runnable {
	public void run() {
		System.out.println("Thread is running..");
	}
	public static void main(String args[] ){
		Runnable r = new ThreadClassWithRunnableString();
		Thread obj=new Thread(r," First Thread");
		obj.start();//move the thread to the active state
		String str=obj.getName();//we are getting the thread name
		System.out.println(str);
		
	}


}
