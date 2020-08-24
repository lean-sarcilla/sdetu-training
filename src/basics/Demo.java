package basics;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(name + " is eating");
	}
	
	void sleep(){
		System.out.println(name + " is sleeping");
	}
}

public class Demo {
	public static void main(String args[]) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Lean";
		person1.email = "lean.r.a.sarcilla@accenture.com";
		person1.phone = "0123456789";
		
		// Abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Rimes";
		person2.email = "sarcilla.lean@gmail.com";
		
		person2.sleep();
		
		
		/*
		// Person
		
		// Attributes, variables, descriptors
		String name = "Lean";
		String email = "lean.r.a.sarcilla@accenture.com";
		String phone = "0123456789";
	
		// Action activity, behavior
		// System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person?
		String name2 = "Rimes";
		String email2 = "sarcilla.lean@gmail.com";
		String phone2 = "0987654321";
		
		// Action activity, behavior
		// System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
	}
	
	static void walking(String name) {
		System.out.println(name + "is walking");
		*/
	}
	
}
