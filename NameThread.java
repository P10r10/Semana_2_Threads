import java.util.Random;

class NameThread extends Thread {

    private int id;
    private int sleepDuration;

    public NameThread(int id) {
        this.id = id;
        sleepDuration = new Random().nextInt(1001) + 1000;
    }

    @Override
    public void run() {
        System.out.println("Id: " + id);
    }
}