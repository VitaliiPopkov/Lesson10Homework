package Task1Vehicle;

public class Vehicle {
    private int price;
    private int speed;
    private int yearOfRelease;
    private int numberOfPassengers;

    public Vehicle(int price, int speed, int yearOfRelease, int numberOfPassengers) {
        this.price = price;
        this.speed = speed;
        this.yearOfRelease = yearOfRelease;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
