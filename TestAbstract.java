package Hd1;
//
abstract class TestAbstract {
  TestAbstract() {
    	System.out.println("Bike is created");
}
    abstract void run(); {
    	
    }
    void changeSpeed() {
    	System.out.println("Speed changed");
    }
    
}
class Child extends TestAbstract{
	void run() {
		System.out.println("Running safely");
		
	}
}
class TestAbstract1{
	public static void main(String args[]) {
		TestAbstract obj = new Child();
		obj.run();
		obj.changeSpeed();
	}
}

