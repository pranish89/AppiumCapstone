package arrays;

import java.util.Scanner;

public class Arrays_add {

	public static void main(String[] args) {

		int[] x = new int[5];	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size=in.nextInt();
		System.out.println("Enter the array values: ");
		for (int i=0;i<size;i++)
		{
			x[i]=in.nextInt();
		}
		in.close();

		int sum=0;	/*
		sum += x[0];
		sum += x[1];
		sum += x[2];
		sum += x[3];
		sum += x[4];
		sum += x[5];
		sum += x[6];
		*/
		for(int i = 0; i < x.length; i++)
		{
			sum = sum + x[i];   // sum += x[i];


}
		System.out.println("sum:" + sum);
	}

}
