package Methods;

public class ArgumentedMethods {

	public static void main(String[] args) {
		m1();
		m2();
		m3("Lion", 2, 7, 908);
		m4(108);
		m5('$');

	}

	public static void m1() {
		System.out.println("Running in m1()");
	}

	public static void m2() {
		System.out.println("Running in m2()");
	}

	public static void m3(String name, int age, int height, int rollNumber) {
		System.out.println("Running in m3()");
		System.out.println("Value of Stirng name = " + name);
		System.out.println("Value of int age = " + age);
		System.out.println("Value of int height = " + height);
		System.out.println("Value of int rollNumber = " + rollNumber);
	}

	public static void m4(int i) {
		System.out.println("Running in m4()");
		System.out.println("Value of int i = " + i);
	}

	public static void m5(char ch) {
		System.out.println("Running in m5()");
		System.out.println("Value of char ch = " + ch);
	}

}
