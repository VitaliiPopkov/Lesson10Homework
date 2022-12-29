package Task2Printer;

public class Yellow extends Printer{
    public void trafficLightYellow() {
        System.out.println("Get ready, it will be green soon");
        System.out.println();
    }
    public void print(){
        System.out.println((char) 27 + "[33mWarning! " + (char)27 + "[0m");


    }
}
