package answer4;

public class Animal {
   /* Write a Java program to create a class called Animal with a method named move().
    Create a subclass called Cheetah that overrides the move() method to run.*/

  public void move(){
      System.out.println("Animal move");
  }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.move();
    }

}
