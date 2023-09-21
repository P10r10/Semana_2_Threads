import java.util.Observable;

public class Car extends Observable implements Runnable {
	private int id;
	private int limit;
	private int position = 0;

	public Car(int id, int limit) {
		super();
		this.id = id;
		this.limit = limit;
	}

	public void run() {
		// TODO
	}

	public int getId() {
		return id;
	}

	public int getPosition() {
		return position;
	}

}
