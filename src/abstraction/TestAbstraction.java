package abstraction;

import interfaceTest.ChromeDriver_BYMAT;
import interfaceTest.FireFoxDriver_BYMAT;
import interfaceTest.WebDriver_BYMAT;

public class TestAbstraction {
	
	public static void main(String[] args) {
		
		RBI_Bank rb;	
		
		rb = new ICICI_Bank();
		
		System.out.println(rb.getRateOfInterest() +" %");
		
		rb = new HDFC_Bank();
		
		System.out.println(rb.getRateOfInterest()+" %");
		
		RBI_Bank.insuranceType();
		
		
		WebDriver_BYMAT driver;
		
		driver = new ChromeDriver_BYMAT();
		driver.getURL();
		
		driver = new FireFoxDriver_BYMAT();
		driver.getURL();
		
	}

}
