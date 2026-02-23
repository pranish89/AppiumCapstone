package Methods;

/**
 * Every Method will have a "return" statement to the end of a method.
 * 
 * Between return and semicolon(;) if data is not available then it is called as
 * default return statement.
 * 
 * For default return statement void is a return type.
 * 
 * If a user is not defining a return statement in a method compiler will auto
 * generate it and it is called as default return statement once again.
 * 
 * If there is a value or data available between "return" and a semicolon (;)
 * depending upon the type of value, the return type of the method will change.
 * 
 * @author Rakesh
 *
 */

public class ReturnTypeOfAMethod {

	public static void main(String[] args) {

		String variable= sleep();
		System.out.println(variable);
	}

	public static void eat() {

		return; // default return statement - compiler will also auto generate if we miss
	}

	public static String sleep() {

		//code -  how to see best dreams
		String str = "bone";
		return str;
	}

	public static void play() {

		return;
	}

}
