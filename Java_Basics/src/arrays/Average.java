package arrays;

public class Average {

	public static void main(String[] args) {
		
		int[] a= {34,65,32,89,66};
		double avg;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("The average value is " +avg);
	}

}
