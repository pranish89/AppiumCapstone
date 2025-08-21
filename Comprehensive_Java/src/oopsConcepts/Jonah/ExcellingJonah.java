package oopsConcepts.Jonah;

public class ExcellingJonah {
	
	public void multi(int a,int b)
	{
		System.out.println("The multiplication is two number " +a +" * " +b +" is " +(a*b) );
	}

	public void multi(float a,float b)
	{
		System.out.println("The multiplication is two number " +a +" * " +b +" is " +(a*b) );
	}
	public static void main(String[] args) {
		
		//methods with same name and return type but with different args is method overloading
		ExcellingJonah obj1= new ExcellingJonah();
		obj1.multi(10, 9);
		obj1.multi(12.5f, 6.5f);
		
		
	}

}
