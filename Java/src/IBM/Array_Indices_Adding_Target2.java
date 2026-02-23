package IBM;

import java.util.HashMap;
import java.util.Map;

public class Array_Indices_Adding_Target2 {
	
	public static int[] sumindices(int[] arr, int target){
	
	//int[] arr = {1,5,8,4,0};
	//int target =9;
		Map<Integer,Integer> map = new HashMap<>();			

	
	for (int i=0;i<arr.length;i++)
	{
		int comp = target - arr[i];
		if(map.containsKey(comp))
		{
			return new int[] {map.get(comp),i};
		}
		map.put(arr[i], i);
		
	}
return new int[] {0,0};
	}
	public static void main(String[] args) {
		
		int[] arr = {1,4,5,6,7};
		int target =89;
		
		int[] result=sumindices(arr,target);
		System.out.println(result[0] +"," +result[1]);

		
	}

}
