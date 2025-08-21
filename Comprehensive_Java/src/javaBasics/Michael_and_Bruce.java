package javaBasics
;

import java.util.Scanner;

/*
Java Basics: Michael and Bruce, Who wins the race ?
		Michael and Bruce are friends. Both of them liked the same girl.       
		One day they started fighting over her and decided that both of them will write a number on a chit.
		The one whose number will be smaller will forget the girl and get out of other’s way.
		The problem was that they were not educated and hence they are still waiting for someone, 
		who could help them to implement the plan.Now try to implement a program which can help them, 
		using the above strategy.*/

public class Michael_and_Bruce {

	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Michael input\n");
		//Create a variable to hold michael input
		int m= input.nextInt();
		System.out.println("Enter the Bruce input \n");
		int b = input.nextInt();
		if (m<b)
		{
			System.out.println("Michael input number is smaller than bruce. \nMichael = " +m +" \nBruce = " +b);
		}
		else
		{
			System.out.println("Bruce input number is smaller than Michael.\nMichael = " +m +"\nBruce = " +b);
		}
	}

}
