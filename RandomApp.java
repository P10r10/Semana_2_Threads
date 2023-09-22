public class RandomApp {
    public static void main(String[] args) throws InterruptedException {
        ThreadA ta = new ThreadA("Thread A");
        ThreadB tb = new ThreadB("Thread B");
        new RamdomWindow(ta, tb);

        ta.start();
        tb.start();
        ta.join();
        tb.join();

        System.out.println("Thread A yielded " + ta.getCount() + " numbers.");
        System.out.println("Thread B yielded " + tb.getCount() + " numbers.");
    }
}
