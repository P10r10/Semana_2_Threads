import java.util.Random;

public class ThreadA extends Thread {

    private long count = 0;
    private final Random rnb;

    public ThreadA() {
        count = 0;
        rnb = new Random();
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(rnb.nextInt(9) + 1);
                count++;
                Thread.sleep(500);
            }
        } catch (InterruptedException ignored) {

        }
    }
}
