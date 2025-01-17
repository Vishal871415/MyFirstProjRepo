package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailboxcapacity;
	private String alternateEmail;
	private int defaultPasswordLength=10;
	
	// constructor to create firstName and lastName
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=setDepartment();
		this.password=setPassword(defaultPasswordLength);
		System.out.println("Email Created: "+firstName+" "+lastName);
		System.out.println("Dept:"+department);
		System.out.println("Password:"+password);
	}
	
	// Ask department
	public String setDepartment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Department COde\n1. Sales\n2. dev\n3. acc\nEnter the code:");
		int deptCode=sc.nextInt();
		
		switch(deptCode)
		{
		case 1:
			return "Sales";
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
	
	// Set the alternate Email
	
	// Change the password
	
}
