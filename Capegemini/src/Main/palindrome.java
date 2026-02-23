package Main;

import java.util.Arrays;

public class palindrome {

	public static void main(String[] args) {
		
		String str1 ="madam";
		String str2 = "";
		int l=str1.length()-1;
		
		for(int i=l;i>=0;i--) {
			
			str2=str2+str1.charAt(i);
			
		}
		
		if(str2.equals(str1))
		{
			System.out.println("The strings are palindrome");
		}

	}

}
