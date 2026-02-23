package IBM;

import java.util.Arrays;

public class BinarySearch {
	
	public static int binarySearch(int a[],int low,int high,int key)
	{
		int mid = (high+low)/2;
		while(low<=high)
		{
			if(a[mid]<key)
			{
				low=mid+1;
			}
			else if(a[mid]==key)
			{
			return mid;
			//break;
			}
			else
			{
				high=mid-1;
			}
			mid = (low+high)/2;
			
				
		}
		if(low>high) {
		return -1;
	}
	return -1;
}

	public static void main(String[] args) {
		
		int[] a = {1,4,2,5,8,3};
		Arrays.sort(a);
		//for (int i :a)
		//System.out.println(i);
		System.out.println(binarySearch(a,0,5,8));
	}

}
