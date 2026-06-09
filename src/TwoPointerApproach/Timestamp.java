package TwoPointerApproach;

import java.time.LocalDateTime;

public class Timestamp  {
	
	public static void printTime() 
	{
		for(int i=0;i<5;i++)
		{
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			LocalDateTime currentDateTime = LocalDateTime. now();
			System. out. println("Current Date and Time: " + currentDateTime);
		}
	}
	
	public static void main(String[] args) {
		
		
		new Thread(() -> printTime()).start();
		
		new Thread(Timestamp::printTime).start();
	}

}
