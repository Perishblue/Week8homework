package answer4;

import java.util.concurrent.Callable;

public class Cheetah extends Animal{

   /* Write a Java program to create a class called Animal with a method named move().
    Create a subclass called Cheetah that overrides the move() method to run.*/

    public void move(){
        System.out.println("Cheetah is running");
    }

    public static void main(String[] args) {
        Cheetah b = new Cheetah();
        b.move();


            }
        }
