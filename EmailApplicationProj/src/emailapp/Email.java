package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailboxcapacity=50;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	private String email;
	private String companySuffix="company.com";
	
	// constructor to create firstName and lastName
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=setDepartment();
		this.password=setPassword(defaultPasswordLength);
		
		// Generate the Email
		email = firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;
	}
	
	// Ask department
	public String setDepartment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Department COde\n1 for sales\n2 for dev\n3 for acc\nEnter the code:");
		int deptCode=sc.nextInt();
		
		switch(deptCode)
		{
		case 1:
			return "sales";
		case 2:
			return "dev";
		case 3:
			return "acc";
		default:
			System.out.println("Please enter the right choice");
			return "";
		}
		
		
	}
	// Randomly generate password
	
	private String setPassword(int len)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@$%&*";
		char[] password=new char[len];
		
		for(int i=0;i<len;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		}
		
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMaiboxCapacity(int capacity)
	{
		mailboxcapacity= capacity;
	}
	
	
	// Set the alternate Email
	public void setAlternateEmail(String alternateEmail)
	{
		this.alternateEmail=alternateEmail;
	}
	// Change the password
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	
	
	public int getMailboxCapacity() {return mailboxcapacity;}
	
	public String getAlternateEmail() {return alternateEmail;}
	
	public String getPassword() {return password;} 
	
	public void ShowInforrmation()
	{
		System.out.println("--------------------------------------");
		System.out.println("Display Name:"+firstName+" "+lastName);
		System.out.println("Email: "+email);
		System.out.println("Generated Password:"+password);
		System.out.println("Mail Box Capacity: "+mailboxcapacity+"mb");
		System.out.println("--------------------------------------");
	}
	
	
}
