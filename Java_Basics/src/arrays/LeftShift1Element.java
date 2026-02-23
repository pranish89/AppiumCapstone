package arrays;
//39. Do left shift by one for elements of given array?


public class LeftShift1Element {

	public static void main(String[] args) {

		int a[] = {23,12,12,45,78};
		System.out.println("Initial array elements ");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		//left shift by 1 element
		for(int j=0; j<a.length-1; j++)
		{
			a[j]=a[j+1];
		}
		System.out.println("final array elements ");
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
