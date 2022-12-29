package Task2Printer;

public class Green extends Printer{
    public void trafficLightGreen(){
        System.out.println("Go-go-go!");
    }
    public void print(){
        System.out.println((char) 27 + "[32mWarning! " + (char)27 + "[0m");

    }
}
