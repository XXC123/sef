package sefA1;

import java.util.Scanner;

public class HRApplication {

	Scanner scanner=new Scanner(System.in);
	
	
	public void login()
	{
	//to-do	
	}
	
	public void run() {
		// TODO Auto-generated method stub
		adminUI();
	}
	
	public void adminUI()
	{
		System.out.println("-----------Menu-----------");
		System.out.println("1.Message other staff");
		System.out.println("2.Check announcements/ notifications");
		System.out.println("3.Check pay rates ");
		System.out.println("4.See weekly roster");
		System.out.println("5.Update profile");
		System.out.println("6.Gather report data");
		System.out.println("7.View all staff");
		System.out.println("8.View course staff requests");
		System.out.println("9.Set rosters");
		System.out.println("0.Allocate staff");
		int selection= scanner.nextInt();
		switch(selection)
		{
			case 1:
				message();
				break;
			case 2:
				viewAnnouncements();
				break;
			case 3:
				checkPayrate();
				break;
			case 4:
				seeRoster();
				break;
			case 5:
				viewProfile();
				break;
			case 6:
				gatherPayroll();
				break;
			case 7:
				viewStaff();
				break;
			case 8:
				viewCourseStaffRequest();
				break;
			case 9:
				setRoster();
				break;
			case 0:
				allocateStaff();
				break;
		}
	}
	
	
	public void coordinatorUI()
	{
		System.out.println("1.Message other staff");
		System.out.println("2.Check announcements/ notifications");
		System.out.println("3.Check pay rates");
		System.out.println("4.See weekly roster");
		System.out.println("5.Update profile");
		System.out.println("6.See course budget");
		System.out.println("7.Set payrate for event");
		System.out.println("8.Class timetabling");
		System.out.println("9.Request staff for events");
		System.out.println("0.Make course anouncement");
		
		int selection= scanner.nextInt();
		switch(selection)
		{
			case 1:
				message();
				break;
			case 2:
				viewAnnouncements();
				break;
			case 3:
				checkPayrate();
				break;
			case 4:
				seeRoster();
				break;
			case 5:
				viewProfile();
				break;
			case 6:
				seeCourseBudget();
				break;
			case 7:
				approveStaffPay();
				break;
			case 8:
				createCourseEvent();
				break;
			case 9:
				StaffForEvent();
				break;
			case 0:
				Announcement();
				break;
		}
	}
	
	
	public void casualUI()
	{
		System.out.println("1.Message other staff");
		System.out.println("2.Check announcements/ notifications");
		System.out.println("3.Check pay rates ");
		System.out.println("4.See weekly roster");
		System.out.println("5.Update profile");
		System.out.println("6.Update resume");
		System.out.println("7.Apply for positions");
		
		int selection= scanner.nextInt();
		switch(selection)
		{
			case 1:
				message();
				break;
			case 2:
				viewAnnouncements();
				break;
			case 3:
				checkPayrate();
				break;
			case 4:
				seeRoster();
				break;
			case 5:
				viewProfile();
				break;
			case 6:
				gatherPayroll();
				break;
			case 7:
				viewStaff();
				break;
			case 8:
				viewCourseStaffRequest();
				break;
			case 9:
				setRoster();
				break;
			case 0:
				allocateStaff();
				break;
		}
	

	}
	
	public void timeManagerUI()
	{
		System.out.println("1.Message other staff");
		System.out.println("2.Check announcements/ notifications");
		System.out.println("3.Check pay rates");
		System.out.println("4.See weekly roster");
		System.out.println("5.Update profile");
		System.out.println("6.Gather weekly payroll data");
		System.out.println("7.Approve staff weekly pay");

		
		int selection= scanner.nextInt();
		switch(selection)
		{
			case 1:
				message();
				break;
			case 2:
				viewAnnouncements();
				break;
			case 3:
				checkPayrate();
				break;
			case 4:
				seeRoster();
				break;
			case 5:
				viewProfile();
				break;
			case 6:
				gatherPayroll();
				break;
			case 7:
				viewStaff();
				break;
			case 8:
				viewCourseStaffRequest();
				break;
			case 9:
				setRoster();
				break;
			case 0:
				allocateStaff();
				break;
		}
	
	}
	
	public void message()
	{
	//to-do	
	}
	public void viewAnnouncements()
	{
	//to-do	
	}
	public void checkPayrate()
	{
	//to-do	
	}
	public void seeRoster()
	{
	//to-do	
	}
	public void applyPosition()
	{
	//to-do	
	}
	public void viewStaff()
	{
	//to-do	
	}
	public void viewCourseStaffRequest()
	{
	//to-do	
	}
	public void setRoster()
	{
	//to-do	
	}
	public void allocateStaff()
	{
	//to-do	
	}
	public void gatherPayroll()
	{
	//to-do
		Report report=new Report();
		report.generateReport();
	}
	public void approveStaffPay()
	{
	//to-do	
	}
	public void seeCourseBudget()
	{
	//to-do	
	}
	public void createCourseBudget()
	{
	//to-do	
	}
	public void createCourseEvent()
	{
	//to-do	
	}public void StaffForEvent()
	{
	//to-do	
	}public void Announcement()
	{
	//to-do	
	}
	public void viewProfile()
	{
	Profile profile= new Profile();
	profile.viewProfile();
	
	System.out.println("-------Modify your profile:-------");
	System.out.println("1.Modify whole profile");
	System.out.println("2.Modify one featrue");
	
	int selection= scanner.nextInt();
	switch(selection)
	{
		case 1:
			profile.modifyProfile();
			break;
		case 2:
			
			System.out.println("1.Modify name");
			System.out.println("2.Modify dob");
			System.out.println("3.Modify phone");
			System.out.println("4.Modify email");
			
			selection= scanner.nextInt();
			switch(selection)
			{
			case 1:
				System.out.println("Input new name");
				profile.setName(scanner.next());
				break;
			case 2:
				System.out.println("Input new dob");
				profile.setDob(scanner.next());
				break;
			case 3:
				System.out.println("Input new phone");
				profile.setPhone(scanner.next());
				break;
			case 4:
				System.out.println("Input new email");
				profile.setEmail(scanner.next());
				break;
			}
			break;
	}
	profile.viewProfile();
		
	}
}

