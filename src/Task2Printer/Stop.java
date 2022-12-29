package Task2Printer;

public class Stop extends Printer {
    public void trafficLightRed () {
        System.out.println("Wait for green traffic light");
        System.out.println();
    }
    public void print() {
        System.out.println((char) 27 + "[31mSTOP! " + (char)27 + "[0m");

    }

}
