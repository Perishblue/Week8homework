package Answer9;

public class Panthera extends Animal{
    /*Write a Java program to create a base class Animal with methods move() and
        makeSound(). Create two subclasses Bird and Panthera. Override the move() method
        in each subclass to describe how each animal moves. Also, override the makeSound()
        method in each subclass to make a specific sound for each animal.*/
    public void move() {
        System.out.println("Panthera walks");
    }
    public void makeSound() {
        System.out.println("Panthera roars");
    }

    public static void main(String[] args) {
        Animal panthera = new Panthera();
        panthera.move();
        performAction(panthera);}
    public static void performAction(Animal animal) {
        animal.makeSound();
    }
    }

