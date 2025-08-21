package Threads.DateTime;

public class System_Data_Time {

	public static void main(String[] args) throws InterruptedException {
		
		Current_Thread t = new Current_Thread();
		t.start();
		Thread.sleep(5000);
		t.stop();
		
	}

}
