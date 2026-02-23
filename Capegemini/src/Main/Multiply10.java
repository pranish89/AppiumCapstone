package Main;

import java.util.Scanner;

public class Multiply10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			int output = n*i;
			System.out.println(n +" * " +i +" = " +output );
		}
		sc.close();
	}

}
