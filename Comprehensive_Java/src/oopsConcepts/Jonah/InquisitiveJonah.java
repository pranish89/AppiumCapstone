package oopsConcepts.Jonah;

public class InquisitiveJonah extends ExcellingJonah {
	//inherting class excelling jonah to override the methods
	//method overloading happens within same class
	//method overriding happens with parent -class 
	
	public void multi(int a, int b)
	{
		System.out.println("This is child method ");
		System.out.println("Addition of 2 numbers " +a +" + " +b +" is " +(a+b));
		
	}
	
	/*public void multi(float a, float b) {
		System.out.println("this is child method ");
		System.out.println("Addition of 2 numbers " +a +" + " +b +" is " +(a+b));

	}*/

	public static void main(String[] args) {
		
		InquisitiveJonah obj1 = new InquisitiveJonah();
		obj1.multi(12, 13);
		//calling the parent method via child obj
		obj1.multi(9.8f,10.5f);
		

	}

}
