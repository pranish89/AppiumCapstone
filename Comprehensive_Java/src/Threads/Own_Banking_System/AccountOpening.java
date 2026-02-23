package Threads.Own_Banking_System;

public class AccountOpening {

	public void open() throws InterruptedException {
		
		System.out.println("Processing your Account opening request");
		Thread.sleep(1000);
		System.out.println("Account opening is done");
	}

}
