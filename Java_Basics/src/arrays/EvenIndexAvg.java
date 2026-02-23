package arrays;
//11. Find out the avg value from all even indexed elements 
//from a given int array?

public class EvenIndexAvg {

	public static void main(String[] args) {
		
		int[] a= {34,56,32,23,28};
		double avg;
		int sum=0;
		for (int i=0;i<a.length;i=i+2)
		{
			sum+=a[i];
		}
		int count = (a.length % 2 == 0? a.length/2 : (a.length/2)+1);
				avg=sum/count;
				System.out.println("The average of all even numbered indexes " +sum );
				System.out.println("The average of all even numbered indexes " +count );
		System.out.println("The average of all even numbered indexes " +avg );

	}

}
