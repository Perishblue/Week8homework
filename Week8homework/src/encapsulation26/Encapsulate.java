package encapsulation26;

public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public class TestEncapsulation extends Encapsulate {
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            obj.setName("Perishblue");
            obj.setAge(20);
            obj.setRollNo(03);

            System.out.println("Perish name:" +obj.getName());
            System.out.println("Perish age:" +obj.getAge());
            System.out.println("Perish rollNo:" +obj.getRollNo());
        }
    }
}
