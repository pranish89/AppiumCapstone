package Variables;

public class Variables {

	// Global variable - Scope of global variables are in each methods of the same
	// class and other classes as well.

	// static variable
	public static String name = "Oreo";
	static double x; // declaration

	// non-static variable // instance variable

	int rollnumber = 3408;

	public static void main(String[] args) {

		// whenever a variables are declared inside a body of a method them they termed
		// as "Local variable" or "Temporary variables"

		int a; // declaration
		a = 300; // initialization
		System.out.println(a); // utilization

		// declaration and initialization in one line
		int b = 300;
		System.out.println(b);

		// the existence of a local variable is only inside the method where it has been
		// declared

		// Scope of a local variable is only within the method they have been declared.

		System.out.println("from main() = " + name);
		m1();
		m2();

		// Create object -
		// ClassName referenceVariableName = new ClassName();
		Variables object = new Variables();
		// System.out.println(object);
		System.out.println("Instance variable = " + object.rollnumber);
		object.m3();
	}

	public static void m1() {

		// System.out.println(b);
		System.out.println("from m1() = " + name);
		

	}

	public static void m2() {
		System.out.println("from m2() = " + name);
		System.out.println("Global Variable = " + x);

	}

	public void m3() {
		System.out.println("Running in non-static m3()");
	}

}
