package dynamic_data_storage;

import java.util.Scanner;

public class TomTrouble {
	
	public static void main(String args[]) {
		
		System.out.println("Enter the numbers");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		
		System.out.println("The addition of 2 numbers " +(a+b));
		System.out.println("The subraction of 2 numbers " +(a-b));
		System.out.println("The multiplication of 2 numbers " +(a*b));
	}

}
