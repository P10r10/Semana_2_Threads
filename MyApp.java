public class MyApp {
    public static void main(String[] args) throws InterruptedException {
        HorseWindow MyWindow = new HorseWindow();
        Horse bucephalus = new Horse(MyWindow.getTf1());
        Horse marengo = new Horse(MyWindow.getTf2());
        Horse trigger = new Horse(MyWindow.getTf3());
        bucephalus.start();
        marengo.start();
        trigger.start();
    }
}
