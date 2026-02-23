package TypeCasting;

public class PremitiveTypeCasting {

	public static void main(String[] args) {

		int i = 10;
		double d = i;

		System.out.println("Value of i before conversion = " + i);

		System.out.println("Value of i after conversion = " + d);

		System.out.println("======================================");

		char ch = 'b';
		int x = ch;

		System.out.println("Value of ch before conversion = " + ch);

		System.out.println("Value of ch after conversion = " + x);

		System.out.println("======================================");

		float pie = 3.1478f;
		int newvalue = (int) pie;
		System.out.println("Value of pie before conversion = " + pie);

		System.out.println("Value of pie after conversion = " + newvalue);

		System.out.println("======================================");

		int number = 99;
		char ch2 = (char) number;
		System.out.println("Value of number before conversion = " + number);

		System.out.println("Value of number after conversion = " + ch2);

		System.out.println("======================================");

	}

}
