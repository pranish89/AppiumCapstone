package IBM;

public class Array_Indices_Adding_Target {

	public static void main(String[] args) {

		int[] arr = {1,5,8,4,0};
		int target =6;
		int ind1=0,ind2=0;
		// find the indices of an array that sums to the target
		
		for (int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] + arr[j] == target)
				{
					ind1=i;
				ind2=j;
				System.out.println(ind1 +" " +ind2);
				}
				
			}
		}
	}

}
