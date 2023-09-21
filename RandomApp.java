public class RandomApp {
    public static void main(String[] args) {
        new RamdomWindow();

        ThreadA ta = new ThreadA();
//        ThreadA rg2 = new ThreadA(1000, 9999);
        ta.start();
//        rg2.start();
    }
}
