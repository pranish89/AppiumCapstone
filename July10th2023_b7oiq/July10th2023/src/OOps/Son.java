package OOps;

/*
 * Conditions for OverRiding - 
 * 
 * Between classes inheritance is must (IS-A) relationship
 * 
 * Both the classes will have same method signature but they differ in implementation.
 * 
 * When we create an object for sub class and we call the common method(which differs in the implementation)
 * 
 * the sub class method will override the super class method body and sub class method body will be demonstrated
 * it is known as "method over-riding".
 * 
 */

public class Son extends Father{
	
	public void job() {
		System.out.println("Wildlife Photographer");
	}

	public static void main(String[] args) {

		Son s = new Son();
		s.job();
	}

}
