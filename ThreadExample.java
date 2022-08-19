package Thread;

public class ThreadExample extends Thread {
	public void run() {
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(800);
			
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			}
	
	System.out.println(Thread.currentThread().getName());
}
public static void main(String args[]) {
	ThreadExample obj=new ThreadExample();
	ThreadExample obj1=new ThreadExample();
	ThreadExample obj2=new ThreadExample();
	obj2.setPriority(MAX_PRIORITY);
	System.out.println(obj2.getPriority());
	System.out.println(Thread.currentThread().getPriority());
	obj.start();
	obj1.start();
	obj2.start();
	obj.setName("TonmoY");
	//String s=obj.getName();
	//System.out.println(s);
}
}
