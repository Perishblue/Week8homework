package question25;

import methodoverriding24.SBI;

public class Student5 {
    int id;
    String name;
    int age;
    Student5(int i, String n){
        id = i;
        name = n;
    }
     Student5(int i, String n, int a) {
        id  = i;
        name = n;
        age = a;
     }
     public void display(){
         System.out.println(id+""+name+""+age);
     }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, " Perish ");
        Student5 s2 = new Student5(222,  " Blue ",   20);
        s1.display();
        s2.display();
    }
}
