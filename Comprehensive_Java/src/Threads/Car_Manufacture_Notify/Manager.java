package Threads.Car_Manufacture_Notify;

public class Manager {
	
	private Dealer dealer;
	
	


	public Manager(Dealer dealer2) {
		this.dealer = dealer2;
	}


	public void notifyManager() throws InterruptedException {
		
		System.out.println("Manager: Manufacturing is complete. Informing dealer.....");
		dealer.purchaseCars();
		
	}
}
