package inheritance;

public class ClassB extends ClassA {

	int a = 10;
	int b;
	private int c;
	static int j;

	public ClassB() {
		// super(12);//for parameterized constructor in parent class, needs to be called
		// like this in 1st line in child constructor.
		System.out.println("Child Constructor");
	}

	public ClassB(int y) {
		super(12);// for parameterized constructor in parent class, needs to be called like this in
					// 1st line in child constructor.

		System.out.println("Parametrized child constructor");
	}

	public void display() {
		System.out.println("display child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ClassA obj1=new ClassA(12); // can create parent class obj in child class
		ClassB obj = new ClassB();// this statement calls both parent class default constructor and child default
									// constructor
		System.out.println("The variable value " + obj.a);// same name variables in both parent n child , oly child
															// variables visible in child class
		obj.display();// same method name in both parent n child, only child method visible in child
						// class.
		//obj.displayparent();
		
	}

}
