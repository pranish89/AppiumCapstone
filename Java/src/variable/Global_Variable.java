package variable;

public class Global_Variable {
	/**global variables should be declared inside class
	 * without initializing default values will be assigned to these variables.
	 */
	
	int i;
	static float j;
	static double k;
	final static char ch ='A';
	static boolean state;
	final int x=20;
	//i=10; global variable should be declared and initialized in same line.
	

	public static void main(String[] args) {
		int i =20;
		System.out.println("the value of local var inside main method " +i);// inside static main method, only static global 
		System.out.println("global variable j default value " +j);          //variables should be called
		System.out.println("global variable k default value " +k );
		System.out.println("global variable ch default value " +ch);
		System.out.println("global variable state default value " +state);
		
		m2();//static method m2 can be called directly without creating objects.
		Global_Variable g1 = new Global_Variable();
		g1.m1();
		
	}
		
		public void m1()
		{
			System.out.println(i);//global variable will be accessed.
			System.out.println(j);//inside non static method , static variable can be called.
			m2();
			
		}
		
		public static void m2()
		{
			System.out.println("this is static method");
			//System.out.println(i); inside static method, cannot call non static variable.
			System.out.println(j); //inside static method only static variable can be called.
		}
		
	}


