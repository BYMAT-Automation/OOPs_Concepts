package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) { // Static binding, Compile time polymorphism

		addition();
		addition(10, 20);
		addition(12, true);
		addition(12, 13, "i am doing addition");
		addition(12, 4, 7);

	}

	public static void addition() {

		System.out.println("I am in addition method");

	}

	public static void addition(int a) {

		System.out.println("value of a variable is:-" + a);

	}

	public static void addition(int a, int b) {

		System.out.println("Addition of two number is:-" + (a + b));

	}

	public static void addition(int a, int b, int c) {

		System.out.println("Addition of three number is:-" + (a + b + c));

	}

	public static void addition(int a, int b, String message) {

		System.out.println("Addition of two number is:-" + (a + b));
		System.out.println("Message is:-" + message);

	}

	public static void addition(int a, boolean b) {

		System.out.println("value of a variable is:-" + a);
		System.out.println("value of b variable is:-" + b);

	}
}
