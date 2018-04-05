package sefA1;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String inputUsername;
		String inputPassword;
		boolean loginSuccess= false;
		
		HashMap<String, staff> staffMembers = new HashMap<String, staff>();
		
		staff[] staffAccounts = new staff[2];
		staffAccounts [0] = new staff ("JS01021984", "Lovingthealien42");
		staffAccounts [1] = new staff ("JD02031983", "Lifeonmars44");
		
		for (int i=0; i<staffAccounts.length; i++)
		{
			staffMembers.put(staffAccounts[i].getUsername(), staffAccounts[i]);			
		}
		
		
		while( loginSuccess == false)
		{
			System.out.println("Log in");
			System.out.println("Username:");
			inputUsername = scan.next();
		
			System.out.println("Password:");
			inputPassword = scan.next();
		
			if (staffMembers.containsKey(inputUsername))
			{
				if (inputPassword.equals(staffMembers.get(inputUsername).getPassword())) 
				{
					loginSuccess = true;
					System.out.println("Welcome to the system.");
				}
			
				else
				{
					System.out.println("Incorrect password used for this account.");
				}
			}
			
			else
			{
				System.out.println("No account detected");
			}
		}
		
		scan.close();

		HRApplication hr=new HRApplication();
		hr.run();
		
	}

}
