package answer6;

public class Bird extends Animal {

   /* Write a Java program to create a base class Animal (Animal Family) with a method
            called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
    each subclass to make a specific sound for each animal.*/

    public void Sound(){
        System.out.println("The bird sound Cooo Cooo Cooo");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.Sound();
    }
}
