package IBM;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNum {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,2,4,3,1};
		Map<Integer,Integer> map = new HashMap<>();
		
		for (int i =0;i<arr.length;i++)
		{
			int a = arr[i];
			if(map.containsKey(a))
			{
 			System.out.println("the duplicate value of " +a +" is at " +i);
			}
			map.put(a, i);
				
		}
		System.out.println(map.keySet());

	}

}
