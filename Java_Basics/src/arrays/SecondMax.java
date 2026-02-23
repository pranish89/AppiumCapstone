package arrays;

public class SecondMax {

	public static void main(String[] args) {

		int[] a= {12, 56, 900,56,453};
		int max1=a[0], max2=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
			else if((max1 == max2) && a[i]>max2)
			{
				max2=a[i];
			}
			
		}
		
		System.out.println("The second max element is " +max2);
	}

}
