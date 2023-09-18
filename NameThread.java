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
            } catch (Exception e) {
                System.out.println("We will deal with this later!");
            }
        }
    }

    public static void main(String[] args) {
        new NameThread(1).start();
        new NameThread(2).start();
    }
}