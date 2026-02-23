package IBM;

public class StringMove {

	public static void main(String[] args) {

		String s = "a#f#G##";
		String s1="java";
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		for (int i=0;i<s.length();i++)
				{
					char c = s.charAt(i);
					if(c=='#')
						sb.append(c);
					else
						sb1.append(c);
				}
		s1="c#";
		System.out.println(sb.toString() +sb1.toString());
		System.out.println(s1 );
	}

}
