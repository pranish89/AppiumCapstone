package Main;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagram(String s1,String s2)
	{
		if((s1 == null || s2 == null) || (s1.length() != s2.length()))
		{
		
		return false;
		}
		
		else
		{
			
			char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return (Arrays.equals(c1, c2));
		}
	}

	public static void main(String[] args) {
		
		System.out.println(anagram("wer",""));
		System.out.println(anagram("",""));
		System.out.println(anagram("","hhu"));
		System.out.println(anagram("wer","jjjnj"));
		System.out.println(anagram("wer","rew"));
		System.out.println(anagram("test","sett1"));





	}

}
