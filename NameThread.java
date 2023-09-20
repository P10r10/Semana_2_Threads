import java.util.Random;

class NameThread extends Thread {

    private int id;

    public NameThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        int sleepDuration = new Random().nextInt(1001) + 1000;

        for (int i = 0; i < 10; i++) {
            System.out.println("Id: " + id);
            try {
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e) {
                System.out.println("Thread id: " + id + " interrupted!");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NameThread one = new NameThread(1);
        NameThread two = new NameThread(2);
        one.start();
        two.start();
        // one.join();
        // two.join();
        Thread.sleep(4000);
        one.interrupt();
        two.interrupt();
        System.out.println("Main done. All done!");

    }
}