package Threads.Car_Manufacture_Notify;

public class Manufacture extends Thread {
	
	private int cars;
	private Manager manager;
	

	
	public Manufacture(int n, Manager manager2) {
		this.cars = n;
		this.manager =manager2;	
		}

	public void run() {
		try
		{
			System.out.println("Manufacturing started for " +cars +" BMW Cars....");
			for (int i=1; i<=cars; i++)
			{
				System.out.println("Manufacturing Car " +i);
				Thread.sleep(3000);//simulate manufacturing time for cars
			}
			
			System.out.println("All " +cars +" cars are manufactured.");
			manager.notifyManager();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}	

}
