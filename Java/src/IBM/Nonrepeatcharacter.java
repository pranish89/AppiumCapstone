package IBM;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Nonrepeatcharacter {
	
	public static void nonrepeat(String s)
	{
		Map<Character,Integer> map = new LinkedHashMap<>();
		for (char c: s.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
	
		
		for (char c:map.keySet())
		{
			//
			//System.out.println(map);
			//System.out.println(map.values());
			//for(Map.Entry<Character, Integer> entry:map.entrySet())
			//{
			if(map.get(c)==1)
			{
				System.out.println("The non repeating character is " +c);
				//return c;

			}
			//}

		}
		//return 0;
		
	}

	public static void main(String[] args) {
		nonrepeat("ababc");

	}

}
