package javaBasics;

import java.util.Scanner;

public class Thomas_school_teacher {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the student name ");
		String name = obj.next();
		System.out.println("Enter the marks in the order of Mathematics,English,Hindi,Science & Social Science: \n");
		int maths = obj.nextInt();
		int english = obj.nextInt();
		int hindi = obj.nextInt();
		int science = obj.nextInt();
		int social_sci = obj.nextInt();

		System.out.println("Marks of the student " +name +"\n"
				+"Maths: " +maths +"\n"
				+"English: " +english +"\n"
				+"Hindi: " +hindi +"\n"
				+"Science: " +science +"\n"
				+"Maths: " +social_sci +"\n");
	

	
	int percentage = (english + maths + hindi+science+social_sci)/5;
	System.out.println("The percentage is " +percentage);
	
	if (percentage<40) {
		System.out.println("POOR");
	}		
		else if ((percentage >=40) && (percentage<59)) {
			System.out.println("Average");
		}
		else if ((percentage >=60) && (percentage<79)) {
			System.out.println("Good");
			
		}else if ((percentage >=80) && (percentage<89)) {
			System.out.println("Very Good");
		}
		else if (percentage >=90){
			System.out.println("Excellent");
	}
	
	
	}

}
