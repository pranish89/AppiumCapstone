package IBM;

public class NonrepeatChar {
	
	public static void main(String[] args)
	{
		String str1 = "testing";
		char[] ch =str1.toCharArray();
		for (int i=0;i<ch.length;i++)
		{ 
			int check =0;
			for (int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					check =1;
					break;
				
			}
			if(check==0)
				System.out.println("The non repeating character is " +ch[i]);
		}

	}

}
