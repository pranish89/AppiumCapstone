package Main;

import java.util.Arrays;

public class string {

	public static void main(String[] args) {
		
		String str1 = "silent";
		String str2 = "listen";
		
		String[] token=str2.split("");
		for (int i=token.length-1;i>=0;i--)
		{
			System.out.print(token[i]);
		}
		
		if (str1.length()!=str2.length()) {
			System.out.println("The strings are not anagram");
			
		}
		else
		{
			char[] a = str1.toCharArray();
			char[] b = str2.toCharArray();
			
			Arrays.sort(a);
			Arrays.sort(b);
			Boolean equal = Arrays.equals(a, b);
			if(equal)
			{
				System.out.println("the strings are anagram");
			}
			else {
				System.out.println("Not anagram");
			}
		}
		
		
		
		/*for (int i=0;i<str1.length();i++) {
			
			char a = str1.charAt(0);
			for (int j=0;j<str2.length();j++)
			{
				int x=0;
				
				if(a==str2.charAt(j))
				{
					System.out.println("The matching character found");
					x=1;
				}
				if(x==1) {
					continue;
				}
				
				}
			}*/
			
		}
				
				

	}


