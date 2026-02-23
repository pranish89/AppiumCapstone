package Threads.Car_Manufacture_Notify;

public class BMWDealership {

	public static void main(String[] args) {

		int n=6; //number of cars 
		
		Dealer dealer = new Dealer();
		Manager manager = new Manager(dealer);
		Manufacture manufacture = new Manufacture(n,manager);
		manufacture.start();
	}

}
