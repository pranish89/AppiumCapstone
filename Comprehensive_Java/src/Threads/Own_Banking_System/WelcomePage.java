package Threads.Own_Banking_System;

import java.util.Scanner;

public class WelcomePage extends Thread{
	
	AccountOpening accountopen= new AccountOpening();
	AccountDetails accdetails = new AccountDetails();
	Deposit deposit = new Deposit() ;
	Withdraw withdraw = new Withdraw();     
	FundTransfer funds = new FundTransfer();
	
	public void run() {
	
		
		System.out.println("Please select any one of the below options: " +"\n"
		+"1.Account Opening" +"\n"
		+"2.Details of your Account" +"\n"
		+"3.For Quick Deposit" +"\n"
		+"4.For Quick Withdraw" +"\n"
		+"5.Fund Transfer" +"\n");
		
		try (Scanner in = new Scanner(System.in)) {
			int n = in.nextInt();
			
			switch(n)
			{
			default:
				System.out.println("please choose any number 1-5");
			break;	
			
			case 1:
				try {
					accountopen.open();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				accdetails.details();
				break;
			case 3:
				deposit.depositfunds();
				break;
			case 4:
				withdraw.withdrafunds();
				break;
			case 5:
				funds.transfer();
				break;
			}
		}
		
		System.out.println("Thank You for using the service");
		System.out.println("********************************");
			
		
		
	}
	
	
	

}
