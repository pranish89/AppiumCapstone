package arrays;
import java.lang.String;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "silent";
				String str2 = "liesNt";
				
				if(str1 != null && str2 != null)
				{
					if (str1.length() == str2.length())
					{
						char[] ch1 = (str1.toLowerCase()).toCharArray();
						char[] ch2 = (str2.toLowerCase()).toCharArray();
						Arrays.sort(ch1);
						Arrays.sort(ch2);
				
						System.out.println(Arrays.binarySearch(ch1, 's'));
						if( Arrays.equals(ch1, ch2))
						{
							System.out.println("The strings are anagram");
						}
						
						
						
					}
				
				else
				{
				System.out.println("The strings are not Anagram");
				}
				}
				

	}

}
