import java.util.Random;

public class ThreadA extends Thread {

    private long count = 0;
    private final Random rnb;

    public ThreadA(String name) {
        super(name);
        count = 0;
        rnb = new Random();
    }

    @Override
    public void run() {
        while (!interrupted()) {
            System.out.println(rnb.nextInt(9000) + 1000);
            count++;
        }
        System.out.println(Thread.currentThread().getName() + " stopped!");
    }

    public long getCount() {
        return count;
    }
}
