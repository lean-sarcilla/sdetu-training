package basics;

public class BankAccountApp {
	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		// acc1.name = "Lean Rimes";
		// With Encapsulation: public API methods
		acc1.setName("Lean Rimes");
		System.out.println(acc1.getName());
		acc1.setSsn("12345890");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "289310384";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(2000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism througho overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "289310384";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "289310384";
		
		/*
		acc3.checkBalance();
		
		// Demo for Inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		*/
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
	}
}
