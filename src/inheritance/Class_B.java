package inheritance;

public class Class_B {
	
	public static int a = 10;
	public static String training = "Selenium Training";
	
	public static  void addition() {
		System.out.println("I am in Parent class Addition method");
		
		Class_B b = new Class_B();
		
		int c = b.a;
		b.addition();
		
	}

}
