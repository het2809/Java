class Shape3 {
    public void area() {
        System.out.println("Display Area : ");
    }
}

class Triangle3 extends Shape3 {
    public void area(double l, double h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape3 {
    public void area(double r) {
        System.out.println((3.14) * r * r);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3();
        t1.area(2.4, 3.8);
        Circle c1 = new Circle();
        c1.area(5);
    }
}