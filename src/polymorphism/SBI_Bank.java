package polymorphism;

public class SBI_Bank extends RBI_Bank{
	
	public double getRateOfInterest() {
		
		System.out.println("I am in SBI bank");
		
		return 8.5;
	}

}
