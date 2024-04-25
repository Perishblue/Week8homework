package Answer5;

public class Motorcycle extends Vehical {

     /*Write a Java program to create a vehicle class hierarchy. The base class should be
            Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    properties such as make, model, year, and fuel type. Implement methods for
    calculating fuel efficiency, distance traveled, and maximum speed.*/

    public double engineDisplacement;
    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        super(make, model, year, fuelType, fuelEfficiency);
    }
    public double getEngineDisplacement() {
        return engineDisplacement;
    }
    public double calculateFuelEfficiency() {
        return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
    }
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public double getMaxSpeed() {
        return 80.0;
    }
    public static void main(String[] args) {

        Motorcycle motorcycle = new Motorcycle("Honda", "Pep", 2020, "Petrol", 3.6);
        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");

    }
}
