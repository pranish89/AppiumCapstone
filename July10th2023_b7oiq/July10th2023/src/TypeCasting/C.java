package TypeCasting;

public class C extends A {
	
	void c2() {
		System.out.println("Running in c2() of C class");
	}
	
	void c4() {
		System.out.println("Running in c4() of C class");
	}

	public static void main(String[] args) {
		
		C ref = new C(); // Sub class object
		//ref.c1();
		//ref.c2();
		
		//polymorphism
		 A obj = new C();
		 obj.c2();
		
		//Has-A relationship
		A ref2 = new A();
		//ref2.c1();
		//ref2.c2();

	}

}
