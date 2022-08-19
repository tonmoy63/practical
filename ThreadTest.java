package Thread;
//thread eg by implementing runnable interface
public class ThreadTest implements  Runnable{
//tread by extending thread class
//public class ThreadTest extends Thread{
	public void run()  
	{    
	System.out.println("I am a thread");    
	}    
	    
	// main method  
	public static void main(String argvs[])  
	{   
		ThreadTest t1=new ThreadTest();
		t1.run();
	}

}