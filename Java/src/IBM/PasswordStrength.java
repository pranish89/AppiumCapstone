package IBM;

public class PasswordStrength {

	public static void main(String[] args) {
		
		String pass = "nisha+isa";
		Boolean upper =false, lower=false, digit=false, special=false;
		
		if (pass.length()<8)
		{
			System.out.println("The password is less than 8 digits");
		}
		else
		{
		for (char c: pass.toCharArray())
		{
			if(Character.isUpperCase(c))
				upper=true;
			else if(Character.isLowerCase(c))
				lower =true;
			else if(Character.isDigit(c))
				digit=true;
			else
				special=true;			
				
		}
		
		
		if(upper && lower && digit && special)
			System.out.println("The password is strong");
		else
			System.out.println("The password is weak");
		}
	}

}
