package Task2Printer;

public class main {
    public static void main(String[] args) {
        Stop stop = new Stop();
        stop.print();
        stop.trafficLightRed();

        Yellow yellow = new Yellow();
        yellow.print();
        yellow.trafficLightYellow();

        Green green = new Green();
        green.print();
        green.trafficLightGreen();

    }
}



//        System.out.println((char) 27 + "[31mWarning! " + (char)27 + "[0m");
//
//        Если хочешь другой цвет, то измени "[31mWarning!". Например, на "[35mWarning!". Текст будет пурпурным.
//        30 - черный. 31 - красный. 32 - зеленый. 33 - желтый. 34 - синий. 35 - пурпурный. 36 - голубой. 37 - белый.