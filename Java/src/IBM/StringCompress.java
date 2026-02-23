package IBM;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCompress {

	public static void main(String[] args) {
		String str= "aaabbbccc";
		Map<Character,Integer> map = new HashMap<>();
		for (int i=0;i<str.length();i++)
		{
			char c =str.charAt(i);
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);

		}
		
		System.out.println(map);
		//for (int j=1;j<map.size();j++)
		////{
		//	System.out.println(map.);
	//	}
		System.out.println(map.keySet());
		System.out.println(map.values());
		//Set<Entry<Character, Integer>> entry = map.entrySet();
		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.print(entry.getKey() +"" +entry.getValue());
		}
		
	}

}
