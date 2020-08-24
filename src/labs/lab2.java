package labs;

public class lab2 {

	public static void main(String[] args) {
		// Create a Student
		Student stud1 = new Student("John", "90282104742745");
		Student stud2 = new Student("Joe", "1467192639902");
		Student stud3 = new Student("Jack", "78212037888273");
	
		stud1.enroll("English101");
		stud1.enroll("Math102");
		stud1.enroll("History111");
		
		//stud1.showCourses();
		//stud1.checkBalance();
		stud1.pay(600);
		//stud1.checkBalance();
		System.out.println(stud1.toString());
	}

}

class Student {
	private static int ID = 0;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	public String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String SSN) {
		ID++;
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmail();
	}
	
	
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	private void setEmail() {
		email = name.toLowerCase() + "." + ID + "@example.com";
		System.out.println("Your email is: " + email);
	}
	
	private String getEmail() {
		return email;
	}
	
	private void setUserID() {
		int min = 1000;
		int max = 9000;
		
		int randNum = (int) (Math.random() * (max-min));
		randNum = randNum + min;
		userID = ID + randNum + SSN.substring(4);
		System.out.println("Your User ID: " + userID);
	}
	
	public void enroll(String course) {
		this.courses = courses + "\n" + course;
		balance = balance + costOfCourse;
	}
	
	public void pay(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance + amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public String toString () {
		return "[NAME: " + name + " ]\n[COURSES:" + courses + " ]\nBALANCE: " + balance + " ]";
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
}
