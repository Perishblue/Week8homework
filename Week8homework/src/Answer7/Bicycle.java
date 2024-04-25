package Answer7;

public class Bicycle extends Vehical{
     /*Write a Java program to create a class Vehicle with a method called speedUp(). Create
    two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
    increase the vehicle's speed differently.*/

    void speedUp() {
        speed += 5; // Increase bicycle's speed by 5
        System.out.println("Bicycle is speeding up. Current speed: " + speed);
    }

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
    }
}
