package Threads.DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Current_Thread extends Thread{
	
	public void run()
	{
		try {
			while(true) {
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
				System.out.println("The current date and time " +now.format(format));
				Thread.sleep(1000);
			}
		}
			catch(InterruptedException e) {
				System.out.println("Thread interrupted: " +e.getMessage());
			}
		}
	}


