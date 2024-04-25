package answer5;

public class Vehical {
    /*Write a Java program to create a vehicle class hierarchy. The base class should be
            Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
    properties such as make, model, year, and fuel type. Implement methods for
    calculating fuel efficiency, distance traveled, and maximum speed.*/

    public String make;
    public String model;
    int year;
    public String fuelType;
    public double fuelEfficiency;

    public Vehical(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double calculateFuelEfficiency(){
        return 0;
    }
    public double calculateDistanceTraveled(){
        return 0;
    }

    public double getMaxSpeed(){
        return 0;
    }
}
