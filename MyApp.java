public class MyApp {
    public static void main(String[] args) throws InterruptedException {
        Window MyWindow = new Window();
        Horse bucephalus = new Horse(MyWindow.getTf1());
        Horse marengo = new Horse(MyWindow.getTf2());
        Horse trigger = new Horse(MyWindow.getTf3());
        bucephalus.start();
        marengo.start();
        trigger.start();
    }
}
