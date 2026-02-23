package Abstraction;

public abstract class RDemo {

	// Incomplete method / abstract method
	public abstract void r3();

	public static void r1() {
		System.out.println("Running in r1() --> complete method");
	}

	// complete or concrete method
	public static void r2() {
		System.out.println("Running in r2() method --> complete method");
	}

	public static void main(String[] args) {
		r1();
		r2();
	}
}
