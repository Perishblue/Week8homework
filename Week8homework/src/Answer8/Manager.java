package Answer8;

public class Manager extends Employee {
     /*Write a Java program to create a class Employee with a method called
            calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
    override the calculateSalary() method to calculate and return the salary based on their
    specific roles.*/

    double baseSalary;


    public Manager(String name, double baseSalary) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Manager("Perishblue", 7500.0);
        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: £" + emp1.calculateSalary());
    }
}