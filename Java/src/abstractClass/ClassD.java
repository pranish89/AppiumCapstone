package abstractClass;
/**
 * Abstract class declared with "abstract" keyword.
 * it can have both concrete and abstract methods
 * objects cannot be created for abstract class
 * it needs to be extended by another class to access its properties
 * extended class needs to override its abstract methods.
 * 
 */

abstract class ClassD {

	int a=10;
	int b= 20;
	
	public ClassD() {
		System.out.println("Abstract class constructor");
	}
	
	public void sum() {
		int c= a+b;
		System.out.println("added values " +c);
	}
	
	public abstract void display();
	
	final void display1() {
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // ClassD obj = new ClassD(); //objects cannot be created for ClassD since its abstract.
	}

}
