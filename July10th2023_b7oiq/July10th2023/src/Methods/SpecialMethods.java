package Methods;

/**
 * Question - What do you mean by the constructor and explain with example -
 * 
 * There are 2 type of constructors - 
 * 
 * 1. Default Constructors 
 * 
 * 2. User Defined Constructor 
 * 		a. zero Argumented 
 * 		b. Argumented constructor
 * 
 * Same constructor existing multiple times in a class but differing in an
 * argument, then it is known as Constructor Overloading
 * 
 * Default Constructor - During compilation time, if constructor is not defined
 * by a user, automatically compiler will generate a constructor and it is known
 * as Default Constructor.
 * 
 * default Constructor doesn't have any arguments and nothing will exist inside
 * the body as well and the constructor would be there in the .class file
 * 
 * When we call any constructor, it is our responsibility to provide the
 * parameter based on the argument of the constructor.
 * 
 * The constructor will not have any return type.
 * 
 * The constructor will not have even the modifier (static) but the methods can have
 * 
 * @author Rakesh
 *
 */

public class SpecialMethods {

	// Constructor
	public SpecialMethods() {
		System.out.println("Running in SpecialMethods()");
	}

	public SpecialMethods(int value) {
		System.out.println("Running in int argumented constructor");
		System.out.println("Value of int value = " + value);
	}

	public SpecialMethods(boolean status) {
		System.out.println("Running in boolean argumented constructor");
		System.out.println("Value of boolean value = " + status);
	}

	public static void main(String[] args) {
		SpecialMethods ref = new SpecialMethods();
		SpecialMethods ref2 = new SpecialMethods(300);
		SpecialMethods ref3 = new SpecialMethods(false);
	}

}
