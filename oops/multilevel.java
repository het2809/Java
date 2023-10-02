class Shape2 {
    public void area() {
        System.out.println("Display Area : ");
    }
}

class Triangle2 extends Shape2 {
    public void area(double l, double h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle2 {
    public void area(double l, double h) {
        System.out.println(0.5 * l * h);
    }
}

public class multilevel {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2();
        t1.area(2.5, 4.7);
        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area(1.2, 1.8);
    }
}
