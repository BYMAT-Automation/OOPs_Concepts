package constructor;

public class Bank_Details {

	public long account_no;
	//public long account_No;

	public Bank_Details() {

		System.out.println("I am in Default Constructor");
		
		System.out.println("Code to launch the Browser");
	}

	public Bank_Details(long account_no) {

		System.out.println("I am in argumented Constructor");
		
		this.account_no = account_no;
		
		//account_No = account_no;
	}

	public double getAccountBalance() {

		// SQL query select * from tableName where schemaName.Account_No = account_no;

		 double balance = 123.34;
		 return balance;

	}

	public String getAccountOwner() {

		// SQL query select * from tableName where schemaName.Owner = account_no;

		String name = "Sagar";
		
		return name; 

	}
	
	public String getAccountDetails() {

		// SQL query select * from tableName where schemaName.Owner = account_no;

		String name = "Sagar";
		
		return name; 

	}

	public void depositAmount() {

	}

}
