package abstraction;

public class HDFC_Bank extends RBI_Bank{

	@Override
	public double getRateOfInterest() {
		System.out.println("I am in HDFC Bank");
		
		return 9.1;
		
	}

}
