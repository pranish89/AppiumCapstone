package IBM;

public class MissingNumber {
	
	public static int missingnum(int[] nums)
	{
		int sum=0,n=nums.length;
		for (int i: nums)
		{
			sum=sum+i;
		}
		System.out.println(sum);
				
		return (n * (n+1)/2) - sum;
	}

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,5,6};

		int result = missingnum(arr);
		System.out.println(result);
	}

}
