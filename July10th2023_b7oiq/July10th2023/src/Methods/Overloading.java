package Methods;

public class Overloading {

	public static void main(String[] args) {

		m1();
		m1(10);
		m1("Hakoonamatata");
		m1(true);
		m1('&');
	}

	public static void m1() {
		System.out.println("Running in m1()");
	}

	public static void m1(int i) {
		System.out.println("Running in m1()");
		System.out.println("Value of int i = " + i);
	}

	public static void m1(double d) {
		System.out.println("Running in m1()");
		System.out.println("Value of double d = " + d);
	}

	public static void m1(boolean status) {
		System.out.println("Running in m1()");
		System.out.println("Value of boolean status = " + status);
	}

	public static void m1(char ch) {
		System.out.println("Running in m1()");
		System.out.println("Running in char ch = " + ch);
	}

	public static void m1(String strr) {
		System.out.println("Running in m1()");
		System.out.println("Running in String strr = " + strr);
	}

}
