package IBM;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
	
	public static int substring(String s)
	{
		Map<Character,Integer> map = new LinkedHashMap<>();
		int maxlen=0,left=0;
		
		
		for (int right =0 ; right<s.length();right++)
		{
			char ch = s.charAt(right);
			if (map.containsKey(ch) && map.get(ch) >= left)
			{
				left = map.get(ch)+1;
			}
			System.out.println(map);
			
			map.put(ch, right);
			//System.out.println(map);
			maxlen = Math.max(maxlen, right - left + 1);
			//System.out.println(maxlen);
		}
		return maxlen;
	}

	public static void main(String[] args) {
		
		System.out.println(substring("testing"));

	}

}
