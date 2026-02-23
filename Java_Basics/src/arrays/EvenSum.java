package arrays;
//7. Find out the sum of all even indexed elements 


public class EvenSum {

	public static void main(String[] args) {

		int[] a= {45, 64, 89, 23, 67,67};
		//         0,  1, 2,  3,  4,  5
		int sum=0;
		
		for(int i=0;i<a.length;i=i+2)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of even indexed number " +sum);
		
		
		}

}
