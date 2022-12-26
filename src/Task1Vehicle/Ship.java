package Task1Vehicle;

public class Ship extends Vehicle {
    String port;

    public Ship(int price, int speed, int yearOfRelease, int numberOfPassengers, String port) {
        super(price, speed, yearOfRelease, numberOfPassengers);
        this.port = port;
    }
}


