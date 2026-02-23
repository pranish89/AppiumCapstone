package exception;

public class OwnExceptionMain {

	public static void main(String[] args) {

		try {
			throw new OwnException("This is custom made exception");
		}
		catch(OwnException e) {
			
			 System.out.println("Caught the Exception");
			 System.out.println(e.getMessage());
			
		}
	}

}
