package Answer5;

public class Car extends Vehical {
     /*Write a Java program to create a vehicle class hierarchy. The base class should be
            Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    properties such as make, model, year, and fuel type. Implement methods for
    calculating fuel efficiency, distance traveled, and maximum speed.*/

    public int numSeats;
    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.numSeats = numSeats;
    }
    public int getNumSeats() {
        return numSeats;
    }
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
    }
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public double getMaxSpeed() {
        return 120.0;
    }

    public static void main(String[] args) {

        Car car = new Car("Volkswagen", "Pollo", 2024, "HYBRID", 8.123, 5);
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");
    }
}
