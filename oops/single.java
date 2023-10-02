class Shape1 {
    public void area() {
        System.out.println("Display Area : ");
    }
}

class Triangle1 extends Shape1 {
    public void area(double l, double h) {
        System.out.println(0.5 * l * h);
    }

}

public class single {
    public static void main(String[] args) {
        Triangle1 t1 = new Triangle1();
        t1.area();
        t1.area(1.2, 4);
    }
}
