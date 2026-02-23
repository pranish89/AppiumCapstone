package Main;

public class Swap {

	public static void main(String[] args) {

		int a=9;
		int b=10;
		int temp;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapped numbers " +a +"\n" +b);
		
		//without temp var
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swapped numbers " +a +"\n" +b);

		
		
	}

}
