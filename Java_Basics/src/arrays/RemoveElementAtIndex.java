package arrays;
//51. Remove specified indexed element from the given array?


public class RemoveElementAtIndex {

	public static void main(String[] args) {

		int[] a = {3,6,2,8,9,4,37,8,54,22}; //remove the element at index 4
		
		System.out.println("The intial array elements are ");
		
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] +",");
		}
		
		for (int j=4; j<a.length-1; j++)
		{
			a[j]=a[j+1];
		}
		
		int[] b = new int[a.length-1];
		
		for(int k=0; k<b.length; k++)
		{
			b[k]=a[k];
		}
		
		System.out.println("The final array elements are ");
		
		for(int i=0; i<b.length; i++)
		{
			System.out.print(b[i] +",");
		}
		
		
		
		
	}

}
