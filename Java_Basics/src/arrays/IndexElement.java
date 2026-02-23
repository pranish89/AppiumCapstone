package arrays;

//28. Find out an index of a specified element 
	//from a given array?

public class IndexElement {

	public static void main(String[] args) {

		int[] a = {12,45,21,78,67,45};
		int element = 78;
				for (int i=0;i<a.length;i++)
				{
					if (a[i] == element)
					{
						System.out.println("element found at index " +i);
						break;
					}
				}
	}

}
