package arrays;

//2. Find the min element from the given int array?


public class MinElement {

	public static void main(String[] args) {
		
		int[] a = {6,8,5,3,6};
		int min=a[0];
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Minimum element in the array " +min);
		

	}

}
