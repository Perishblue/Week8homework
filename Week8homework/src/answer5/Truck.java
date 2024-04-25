package answer5;

public class Truck extends Vehical {
     /*Write a Java program to create a vehicle class hierarchy. The base class should be
            Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    properties such as make, model, year, and fuel type. Implement methods for
    calculating fuel efficiency, distance traveled, and maximum speed.*/

    public double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
        super(make, model, year, fuelType, fuelEfficiency);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }
    public double calculateFuelEfficiency() {
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
    }
    public double calculateDistanceTraveled() {
        return calculateFuelEfficiency() * getFuelEfficiency();
    }
    public double getMaxSpeed() {
        return 80.0;
    }

    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "Volvo c10", 2023, "Petrol", 6.120, 5.5);
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");
    }
}
