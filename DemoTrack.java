import javax.swing.*;
import java.util.ArrayList;

public class DemoTrack {

	public static void main(String[] args) {
		final int CARS = 10; // number of total cars
		ArrayList<Car> cars = new ArrayList<>();
		ArrayList<Thread> threads = new ArrayList<>();

		JFrame frame = new JFrame("Demo Track");
		Track track = new Track(CARS, 100);
		frame.add(track);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
		for (int i = 0; i < CARS; i++) { // adds every car and thread
			cars.add(new Car(i, 100, threads));
			cars.get(i).addObserver(track);
			threads.add(new Thread(cars.get(i)));
			threads.get(i).start();
		}
	}
}
