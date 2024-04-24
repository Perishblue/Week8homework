package answer6;

public class Animal {
    /*Write a Java program to create a base class Animal (Animal Family) with a method
            called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
    each subclass to make a specific sound for each animal.*/

    public void Sound() {
        System.out.println("The Animal make sound");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.Sound();

    }
}