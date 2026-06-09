package CONCURRENTCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/*A concurrent collection is a set of classes that
 *  allow multiple threads to access and modify a collection simultaneously, without the need for explicit synchronization: 
 */

   

public interface FileSafeExample {
	
	
	
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>();
		
		List<Integer> list = new CopyOnWriteArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		
		Set<Integer>  set = new CopyOnWriteArraySet<>();
		
		
		
		

		
		
		Runnable task1 = ()->
		{
			for(int  value :list)
			{
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(value);
			}
		};
		
		Runnable task2 = () -> {
			try {
				Thread.sleep(50);  // Wait before adding
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Adding element: 7");
			list.add(7);
			System.out.println("Adding element: 8");
			list.add(8);
			System.out.println("Adding element: 9");
			list.add(9);
		};
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
		try {
			// Wait for both threads to complete
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
         
			
		System.out.println(list);
	}
	

}
