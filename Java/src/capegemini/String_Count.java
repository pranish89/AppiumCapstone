package capegemini;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String_Count {
	
	public static void count(String str1)
	{
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);	
			map.put(c, map.getOrDefault(c, 0)+1);
		
		
		}
		//System.out.println(map);
		for (char c:map.keySet())
		{
			System.out.print(c +"" +map.get(c));
		}
		
		//System.out.println(map.entrySet());
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
		System.out.print(entry.getKey() +"" +entry.getValue()) ;
		}
		
	}

	public static void main(String[] args) {
		
		//aaabbcddee --> a3b2c1d2e2
		
		String str1 = "aaabbcddee";
		count(str1);
		
	
		 

	}

}
