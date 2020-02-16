package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapasity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "Akronim.com";
	
	//constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//call a method asking for the department- return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//call a method that returns a ramdon password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+ this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."  + companySuffix;
		//System.out.println("your email is: " + email);
		
	}
	
	
	
	
	//ask for the department
	private String setDepartment() {
		System.out.print("Hello " + this.firstName +" Please select department code: \n1 for sales\n2 for developement\n3 for accounting\n0 for none\n Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice ==1) { return "Sales";}
		else if (deptChoice ==2) { return "Development";}
		else if (deptChoice ==3) { return "Accounting";}
		else { return "";}
		
	}
	
	//generate a random password
	private String randomPassword(int lenght) {
		String passwordSet = "ABCEFGHIJKLMNOPQRSUTVWXYZ0123456789!@#$%";
		char[] password = new char[lenght];
		for (int i=0;i<lenght; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capasity
	public void setVoicemailCapasity(int capacity) {
		this.mailboxCapasity = capacity;
		
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacitu() { return mailboxCapasity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getpassword() {return password;}
	
	public String showInfo() {
		return "EMPLOYEE INFORMATION: " + "\n" + "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
				"DEPARTMENT: " + this.department + "\n" +
				"COMPANY EMAIL: " + email +"\n"  +
				"MAILBOX CAPACITY: " + "" + mailboxCapasity + "mb";
	}
	

}
