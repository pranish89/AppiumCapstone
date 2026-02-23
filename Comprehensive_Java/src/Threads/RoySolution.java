package Threads;

import java.util.Scanner;

public class RoySolution {

	public static void main(String[] args) {
		
		double sum = 0;
		int warning =0;
		
		System.out.println("Enter the daily income of workers: ");
		Scanner in  = new Scanner(System.in);
		
		while(true) {
			
			double d = in.nextDouble();
			
			try {
				
				if(d==0)
				{
					System.out.println("Total Daily earnings: " +sum);
					break;
				}
				if(d<0) {
					
					System.out.println("Income cannot be negative.Try Again ");
					continue;
				}
				
				sum+=d;
				
				
			}catch(NumberFormatException e) {
				
				warning++;
				
				if(warning<=2) {
					
					System.out.println("Invalid Input. Please enter a number.Warning " +warning +"/2");
				}
				else
				{
					System.out.println("Too many invalid attempts.Final total = " +sum);
					break;
				}
			}
			
		}
		in.close();
		
	}

}
