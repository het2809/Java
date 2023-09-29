
class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class parameterized {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Het", 18);
        s1.printInfo();
    }
}
