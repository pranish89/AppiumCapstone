package Main;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		//0,1,1,2,3,5,8,13
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int num = in.nextInt();
		in.close();
		int a=0,b=0,c=1;
		for(int i=0;i<num;i++) {
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a);
			
		}
	}

}
