class student {
    String name;
    int age;

    student() {
        System.out.println("Constructor called");
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class non_parameterized_constructor {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Het";
        s1.age = 18;
        s1.printInfo();
    }
}
