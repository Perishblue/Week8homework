package answer8;

public class Programer extends Employee{
    /*Write a Java program to create a class Employee with a method called
            calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
    override the calculateSalary() method to calculate and return the salary based on their
    specific roles.*/

    double baseSalary;

    public Programer(String name, double baseSalary) {
        super(name, "Programer");
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }

    public static void main(String[] args) {
        Employee emp2 = new Programer("Perish", 5000.0);
        System.out.println("\nProgramer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: £" + emp2.calculateSalary());

    }
}
