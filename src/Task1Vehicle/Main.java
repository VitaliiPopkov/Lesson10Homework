package Task1Vehicle;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(27000, 350, 2010, 300, 4);
        Car car = new Car(5000, 190, 2012, 4);
        Ship ship = new Ship(70000, 90, 2021, 400, "Haifa");
        System.out.println("The cost of the plane: " + plane.getPrice() + " $. Speed: " + plane.getSpeed() + " km/h. Year of release: " + plane.getYearOfRelease() + ". Number of passengers: " + plane.getNumberOfPassengers() + " persons. Height: " + plane.height + " m.");
        System.out.println("The cost of the car: " + car.getPrice() + " $. Speed: " + car.getSpeed() + " km/h. Year of release: " + car.getYearOfRelease());
        System.out.println("The cost of the ship: " + ship.getPrice() + " $. Speed: " + ship.getSpeed() + " km/h. Year of release: " + ship.getYearOfRelease() + ". Number of passengers: " + ship.getNumberOfPassengers() + " persons. Port: " + ship.port + ".");


    }
}
