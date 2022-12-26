package Task1Vehicle;

public class Plane extends Vehicle {
    double height;

    public Plane(int price, int speed, int yearOfRelease, int numberOfPassengers, double height) {
        super(price, speed, yearOfRelease, numberOfPassengers);
        this.height = height;
    }
}




