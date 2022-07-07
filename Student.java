package javaprogram;

public class Student {
	int id;
	String name;
	Address address;
	public Student(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		}
	public static void main(String[]args)
	{
		Address address1 = new Address("dgp","wb","india");
		Address address2 = new Address("kol","wb","india");
		Student s=new Student(12,"Tonmoy",address1);
		Student s1=new Student(12,"Halder",address2);
		s.display();
		s1.display();
	}}


