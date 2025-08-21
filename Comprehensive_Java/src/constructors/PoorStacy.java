package constructors;

public class PoorStacy {
	
	int multiply_number;
	
	public PoorStacy(int a)
	{
		multiply_number=a;
	}
	
	public void multiply_calc()
	{
		System.out.println("The Multiplication table of " +multiply_number);
		for (int i=1;i<=10;i++) {
			System.out.println(+i +" * " +multiply_number +"= " +i*multiply_number);
		}
	}
	

	public static void main(String[] args) {
		
		PoorStacy obj1 = new PoorStacy(3);
		obj1.multiply_calc();
	}

}
