package arrays;

public class Vowel {

	
	public static boolean vowelmatch(java.lang.String string)
	{
		return string.toLowerCase().matches(".*[aeiou]*.");
	}
	public static void main(java.lang.String[] args) {
		System.out.println(vowelmatch("subhiksha"));
	}

}
