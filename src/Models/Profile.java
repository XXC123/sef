package Models;

import java.util.Scanner;

public class Profile {

	Scanner scanner=new Scanner(System.in);
	
	private String name;
	private String dob;
	private String phone;
	private String email;

	public Profile()
	{
	}
	
	public void updateProfile()
	{
	//to-do	
	}
	
	public void viewProfile()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Date of birth: "+this.dob);
		System.out.println("Phone: "+this.phone);
		System.out.println("Email: "+this.email);
	}
	
	public void updateResume()
	{
	//to-do	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void modifyProfile() {
		System.out.println("Input new name");
		this.name=scanner.next();
		
		System.out.println("Input new dob");
		this.dob=scanner.next();
		
		System.out.println("Input new phone");
		this.phone=scanner.next();
		
		System.out.println("Input new email");
		this.email=scanner.next();
		
	}
	
}
