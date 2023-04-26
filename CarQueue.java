import java.util.LinkedList;
import java.util.Queue;

public class CarQueue implements Runnable {
	
	Queue<Integer> q = new LinkedList<Integer>();
	
	//constructor
	public CarQueue() {
		for(int i = 0; i < 20 ;i++) {
			int num = (int)(Math.random() * (4));
			q.add(num);
		}

	}
	
	
	public void addToQueue() {
		Runnable r = new CarQueue();
		r.run();
	}
	
	
	
	
	
	public int deleteQueue() {
		
		q.add((int)(Math.random() * (4)));
		
		return q.remove();
			
		
	}

	
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10 ;i++) {
			int num = (int)(Math.random() * (3+1));
			q.add(num);
		}
		
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
