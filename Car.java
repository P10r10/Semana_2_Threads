import java.util.Observable;
import java.util.Random;

public class Car extends Observable implements Runnable {
	private int id;
	private int limit;
	private int position = 0;
	private Thread mainThread;

	public Car(int id, int limit, Thread mainThread) {
		super();
		this.id = id;
		this.limit = limit;
		this.mainThread = mainThread;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			while (position < limit - 1) {
				Thread.sleep(new Random().nextInt(100));
				position += 1;
				setChanged();
				notifyObservers();
			}
			mainThread.interrupt();

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
