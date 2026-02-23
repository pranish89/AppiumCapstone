package arrays;
//3. Find the max element from the given int array?


public class MaxElement {

	public static void main(String[] args) {
		
		char[] a = {'a','t','i','o','r'};
		char max=a[0];
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max element in the character array is " +max);
	}

}
