import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;

public class Car extends Observable implements Runnable {
	private int id;
	private int limit;
	private int position = 0;
	ArrayList<Thread> threads;

	public Car(int id, int limit, ArrayList<Thread> threads) {
		super();
		this.id = id;
		this.limit = limit;
		this.threads = threads;
	}
	@Override
	public void run() {
		try {
			while (position < limit - 1) {
				Thread.sleep(new Random().nextInt(100));
				position += 1;
				setChanged();
				notifyObservers();
				if (position == limit - 1) {
					System.out.println("Car #" + id + " won!");
					for (Thread thread : threads) {
						thread.interrupt();
					}
				}
			}
		} catch (InterruptedException e) {
		}
	}

	public int getId() {
		return id;
	}

	public int getPosition() {
		return position;
	}

}
