package exception;

import java.util.Scanner;

public class BankingSystem {

	public static void main(String[] args) throws BankOwnException {
		
		long initialaccoutbalance = 500;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the transaction type (Balance or Withdrawal");
		
		String type = in.nextLine();
		
		if (type.equalsIgnoreCase("Balance")) {
			
			System.out.println("Balance amount is " +initialaccoutbalance);
		}
		
		else if(type.equalsIgnoreCase("Withdrawal")) {
			
			System.out.println("Enter the withdrawal amount");
			int withdrawal = in.nextInt();
			if (withdrawal>initialaccoutbalance)
			{
				try {
					throw new BankOwnException("Insufficient Funds");
				}
				catch(BankOwnException o)
				{
					System.out.println("Caught the exception");
					System.out.println(o.getMessage());
				}
			}
			else {
			
			double balance = initialaccoutbalance-withdrawal;
			System.out.println("The account balance after withdrawal " +balance);
			}
			
		}
	}

}
