package abstraction;

public class ICICI_Bank extends RBI_Bank{

	@Override
	public double getRateOfInterest() {	
	System.out.println("I am in ICICI Bank");	
		return 9.5;
	}

}
