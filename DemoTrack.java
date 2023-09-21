import javax.swing.*;
import java.util.ArrayList;

public class DemoTrack {

	public static void main(String[] args) {
		final int CARS = 3; // number of total cars
		ArrayList<Car> cars = new ArrayList<>();

		JFrame frame = new JFrame("Demo Track");
		Track track = new Track(CARS, 100);
		for (int i = 0; i < CARS; i++) { // adds every car
			cars.add(new Car(i, 100, Thread.currentThread()));
			cars.get(i).addObserver(track);
		}
		frame.add(track);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
		try {
			for (int i = 0; i < CARS; i++) {
				new Thread(cars.get(i)).start();
			}

		} catch (InterruptedException e) {
			System.out.println("INTERRUPT");

		}
	}
}
