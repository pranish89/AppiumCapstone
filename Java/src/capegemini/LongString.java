package capegemini;

public class LongString {
	
	public static String reverse(String word)
	{
		String rev ="";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		
		String s = "An empty vessel makes more noise";
		// Find the min and max length words, reverse oly that word and print the entire string
		
		String original= s;
		String[] split = s.split(" ");
		/*for (String s1: split)
		{
			System.out.println(s1);
		}*/
		
		String minword = split[0];
		String maxword = split[0];
		//System.out.println(minword +" " +maxword);
		for (String s1: split )
		{
			if(s1.length()<minword.length())
			{
				minword =s1;
			}
			if(s1.length()>maxword.length())
			{
				maxword=s1;
			}
		}
		
		String rev_minword=reverse(minword);
		String rev_maxword=reverse(maxword);
		StringBuffer sb = new StringBuffer();

		for(String s2:split)
		{
			if(s2.equals(minword))
				sb.append(rev_minword);
				else if(s2.equals(maxword))
					sb.append(rev_maxword);
					else
						sb.append(s2);
			sb.append(" ");
		}
		System.out.println(sb.toString());

	}

}
