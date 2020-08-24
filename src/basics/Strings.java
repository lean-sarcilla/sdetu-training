package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if(bookTitle.contains("Ring")){
			System.out.println("The book contains the word Ring");
		}
		
		String browser = "Chrome";
			// (browser == "chrome")
			if(browser.equalsIgnoreCase("chrome")) {
					System.out.println("The browser is chrome");
			}
		String firstName = "Lean";
		String lastName = "Sarcilla";
		String SSN = "6789090108";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
			// Print the initials plus last 4 digits of SSN
		System.out.println(firstName.substring(0,1));
		System.out.println(lastName.substring(0,1));
		System.out.println(SSN.substring(5));
	
	}
}
