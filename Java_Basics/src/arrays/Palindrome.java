package arrays;

public class Palindrome {

	public static void main(java.lang.String[] args) {
		
		java.lang.String s1 = "Madam";
		
		java.lang.String rev = "";
		
		for (int i=s1.length()-1;i>=0;i--)
		{
			rev=rev + s1.charAt(i);
		}
		
		System.out.println(rev);
		
		if(s1.equalsIgnoreCase(rev))
		{
			System.out.println("equal");
		}
		
		

	}

}
