package TypeCasting;

public class A {
	
	void c1() {
		System.out.println("Running in c1() of A class");
	}

	void c2() {
		System.out.println("Running in c2() of A class");
	}

	public static void main(String[] args) {
		
		A ref = new A();
		ref.c1();
		ref.c2();
	}

}
