package Thread;

public class SquentialEg {
	 public void run()  
	    {    
	        for(int i=1;i<5;i++)  
	        {    
	            try 
	            {  
	                Thread.sleep(500);  
	            }catch(InterruptedException e)
	            {
	            	System.out.println(e);
	            	}    
	            System.out.println(i);    
	        }    
	    }    
	    public static void main(String args[])  
	    {    
	    	SquentialEg thread1=new SquentialEg();    
	    	SquentialEg thread2=new SquentialEg(); 
	    	SquentialEg thread3=new SquentialEg(); 
	        thread1.run();    
	        thread2.run();  
	        thread3.run();
	    }    
	}  


