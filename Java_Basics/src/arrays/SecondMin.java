package arrays;
//4. Find the 2nd min element from the given int array?

public class SecondMin {

	public static void main(String[] args) {
		
		int[] x= {10,9,8,7,6};
		int min1=x[0], min2=x[0];
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]<min1)
			{
				min2=min1;
				min1=x[i];
			}
			else if (x[i]<min2)
			{
				min2=x[i];
			}
		}
		System.out.println("second min element is " +min2);
		

		

	}

}
