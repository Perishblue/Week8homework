package Answer9;

public class Bird extends Animal {
    /*Write a Java program to create a base class Animal with methods move() and
        makeSound(). Create two subclasses Bird and Panthera. Override the move() method
        in each subclass to describe how each animal moves. Also, override the makeSound()
        method in each subclass to make a specific sound for each animal.*/
    public void move() {
        System.out.println("Bird flies");
    }

    public void makeSound() {
        System.out.println("Bird Coo Coo");
    }

    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.makeSound();
        performAction(bird);}
        public static void performAction (Animal animal){
            animal.move();
        }
    }
