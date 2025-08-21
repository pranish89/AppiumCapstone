package constructors;

import java.util.Scanner;

public class Mr_Thomas {
	
	int maths,english,hindi,science,social_sci;
	String name;

	
	public Mr_Thomas(String x,int a,int b,int c,int d,int e) {
		maths=a;
		english=b;
		hindi=c;
		science=d;
		social_sci=e;
		name=x;
		System.out.println("Marks of the student " +name +"\n"
				+"Maths: " +maths +"\n"
				+"English: " +english +"\n"
				+"Hindi: " +hindi +"\n"
				+"Science: " +science +"\n"
				+"Maths: " +social_sci +"\n");
	
		
	}
	
	public void percentage()
	{
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
	//check marks
	
public static int check(String subject,int marks) {
	
	if (marks<0 || marks>100)
	{
		System.out.println("The entered mark of subject " +subject +" incorrect,kindly enter the marks again");
		Scanner obj = new Scanner(System.in);
		int correct = obj.nextInt();
		return (correct);

	}
	else
	{
		return(marks);
	}
}

	

	public static void main(String[] args) {
		for (int i=0;i<100;i++) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the student name ");
		String name = obj.next();
		System.out.println("Enter the marks in the order of Mathematics,English,Hindi,Science & Social Science: \n");
		int maths = obj.nextInt();
		maths = Mr_Thomas.check("Mathematics", maths);
		int english = obj.nextInt();
		english = Mr_Thomas.check("English", english);
		int hindi = obj.nextInt();
		hindi = Mr_Thomas.check("Hindi", hindi);

		int science = obj.nextInt();
		science = Mr_Thomas.check("Science", science);

		int social_sci = obj.nextInt();
		social_sci = Mr_Thomas.check("Social_sci", social_sci);
		
		Mr_Thomas obj1=new Mr_Thomas(name,maths,english,hindi,science,social_sci);
		obj1.percentage();
		System.out.println("Do You want to continue Y/N");
		//Scanner obj11 = new Scanner(System.in);
		if(obj.next().equals("N"))		
			break;

	}
		System.out.println("Percentage calculation is done");
	}

}