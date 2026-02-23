package IBM;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring1 {
	
	public static int substring(String s)
	{
		Set<Character> set = new HashSet<>();
		int left=0,max=0;
		
		for(int right =0;right<s.length();right++)
		{
			while(set.contains(s.charAt(right)))
			{
				set.remove(s.charAt(left));
				System.out.println("loopset " +set);

				left++;
				System.out.println("left " +left);

			}
			set.add(s.charAt(right));
			System.out.println(set);
			max=Math.max(max, right - left +1);
			System.out.println(max);
		}
		return max;
	}

	public static void main(String[] args) {
		
		System.out.println(substring("teseing"));

	}

}
