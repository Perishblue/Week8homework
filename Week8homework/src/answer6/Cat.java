package answer6;

import java.util.concurrent.Callable;

public class Cat extends Animal{
    /*Write a Java program to create a base class Animal (Animal Family) with a method
            called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
    each subclass to make a specific sound for each animal.*/

    public void Sound() {
        System.out.println("The Cat sound is Meows Meows");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.Sound();

            }
        }


