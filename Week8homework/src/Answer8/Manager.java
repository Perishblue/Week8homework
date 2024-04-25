package Answer8;

public class Manager extends Employee {
     /*Write a Java program to create a class Employee with a method called
            calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
    override the calculateSalary() method to calculate and return the salary based on their
    specific roles.*/

    double baseSalary;
    double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return baseSalary + bonus;
    }

    public static void main(String[] args) {
        Employee emp1 = new Manager("Perishblue", 7500.0, 1500.0);
        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: £" + emp1.calculateSalary());
    }
}