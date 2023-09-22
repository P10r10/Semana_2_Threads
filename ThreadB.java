import java.util.Random;

public class ThreadB extends Thread {

    private long count;
    private final Random rnb;

    public ThreadB(String name) {
        super(name);
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
            System.out.println(Thread.currentThread().getName() + " stopped!");
        }
    }

    public long getCount() {
        return count;
    }
}
