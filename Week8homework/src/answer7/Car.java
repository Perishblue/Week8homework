package answer7;

public class Car extends Vehical{
    /*Write a Java program to create a class Vehicle with a method called speedUp(). Create
    two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
    increase the vehicle's speed differently.*/

    void speedUp() {
        speed += 10; // Increase car's speed by 10
        System.out.println("Car is speeding up. Current speed: " + speed);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.speedUp();
    }
}
