package polymorphism;

public class MothodOverRiding { // Dynamic binding or Run time polymorphism

	public static void main(String[] args) {

		RBI_Bank sbi = new SBI_Bank();
		
		System.out.println(sbi.getRateOfInterest());

		RBI_Bank icici = new ICICI_Bank();

		System.out.println(icici.getRateOfInterest());

		RBI_Bank hdfc = new HDFC_Bank();

		System.out.println(hdfc.getRateOfInterest());
	}
	
	// There should be inheritance relation in two classes
	// Method name and data type should be same in both parent and child class
	// Create the object of child class and assign it to the reference variable of Parent class

}
