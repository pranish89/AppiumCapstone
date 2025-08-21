package variable;

public class Local_Variable {

	public static void main(String[] args) {
		
		int i; //declaration, variables declared inside main method or any other method is local variable.
		i=10; //for local var, declaration and initialization can happen in different lines.
		int j;
		//static int z;// variables inside the method or local variables cannot be declared as Static
		final double pi = 3.14;//only final modifier is allowed for local variables.
		//to call a non static method m1 inside a static main method, object needs to be created.
		Local_Variable l1 = new Local_Variable();
		l1.m1();
		//System.out.println(j);// local var does not have default values.

	}
	
	public void m1()
	{
		//System.out.println(i);// local variable i is not visible outside of main method.
		double pi=3.144; // even though there are 2 pi variables of same name, only the pi insode this methos will be visible.
		System.out.println(pi);//even though we have a method in class level(i.e outside main), 
		                       //it should be called inside main method.
		
	}

}
