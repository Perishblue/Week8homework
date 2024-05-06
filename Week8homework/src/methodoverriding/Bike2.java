package methodoverriding;

public class Bike2 extends Vehical{
    public void run(){
        System.out.println("Bike is running safety");
    }

    public static void main(String[] args) {
        Bike2 b = new Bike2();
        b.run();
    }
}
