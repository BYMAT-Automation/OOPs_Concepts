package constructor;

public class TestConstructor {
	
	public static void main(String[] args) {
		
		//Bank_Details bd = new Bank_Details();
		
		Bank_Details bd = new Bank_Details(123456);
		
		System.out.println("Account Balance is:- " + bd.getAccountBalance());
		
		System.out.println("Account owner is:- " + bd.getAccountOwner() );
		
		//WebDriver driver = new ChromeDriver();
		
		
	}

}
