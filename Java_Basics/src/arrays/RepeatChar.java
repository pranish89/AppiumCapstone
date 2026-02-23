package arrays;

import java.lang.String;

public class RepeatChar {

	public static void main(java.lang.String[] args) {
		
		String str1="Apple";
		//int[] a = new int[5];
		boolean[] b= new boolean[str1.length()];

		char[] ch = str1.toCharArray();
				for (int i=0;i<str1.length();i++) 
				{
					if (b[i])
						continue;
					int c=1;
					for(int j=i+1;j<str1.length();j++) 
					{
				if(ch[j]==ch[i]) 
				{
					c++;
					b[j]=true;
				}
					}
				
				System.out.println(" The character occurence of " +ch[i] +" is " +c);
				
			
		}
		

	}

}
