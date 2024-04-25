package Answer11;

public class Person {
   /* Write a Java program to create a class called Person with private instance variables
    name, age. and country. Provide public getter and setter methods to access and modify
    these variables.*/
   private String name;
   private int age;
   private String country;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();
        person.setName("Perishblue");
        person.setAge(20);
        person.setCountry("India");
        String name = person.getName();
        int age = person.getAge();
        String country = person.getCountry();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}
