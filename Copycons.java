package javaprogram;

public class Copycons {
	private String name;
	private double marks;
	//constructor
	Copycons(String name, double marks){
		this.name=name;
		this.marks=marks;
	}
	// copy constructor
	Copycons(Copycons c){
		//getters setters
		this.name=c.getName();
		this.marks=c.getMarks();	
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks=marks;
	}
	
}
	
