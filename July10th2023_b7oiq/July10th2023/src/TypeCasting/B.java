package TypeCasting;

public class B extends A {

	void c3() {
		System.out.println("Running in c3() of B class");
	}

	void c4() {
		System.out.println("Running in c4() of B class");
	}

	public static void main(String[] args) {

		System.out.println("================= Through Sub Class object ===================");
		B obj = new B();
		obj.c1();
		obj.c2();
		obj.c3();
		obj.c4();

		System.out.println("================ Up-Casting=================");

		// Up-casting
		A ref = new B(); // Creation of subclass object and upcasting in single line
		ref.c1();
		ref.c2();

		System.out.println("================ Down-Casting=================");

		B obj2 = (B) ref;
		obj2.c1();
		obj2.c2();
		obj2.c3();
		obj2.c4();
		
	}

}
