import java.util.Observable;
import java.util.Random;

public class Car extends Observable implements Runnable {
	private int id;
	private int limit;
	private int position = 0;

	public Car(int id, int limit) {
		super();
		this.id = id;
		this.limit = limit;
	}
	@Override
	public void run() {
		try {
			while (position < limit - 1) {
				Thread.sleep(new Random().nextInt(100));
				position += 1;
				setChanged();
				notifyObservers();
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
