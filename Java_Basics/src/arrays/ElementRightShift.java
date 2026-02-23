package arrays;

//36. Do right shift by one for elements of given array?


public class ElementRightShift {

	public static void main(java.lang.String[] args) {
		
		int a[] = {45,23,22,45,33,90};
		System.out.println("The initial array element ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +", ");
		}
		
		for (int j=a.length-1;j>0;j--)
		{
			a[j]=a[j-1];
		}
		
		System.out.println("The final array element ");
		for(int i=1;i<a.length;i++)
		{
			System.out.print(a[i] +", ");
		}
		
	}

}
