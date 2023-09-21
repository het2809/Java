class pen {
    String color;
    String type;

    public void printcolor() {
        System.out.println(this.color);
    }

    public void printtype() {
        System.out.println(this.type);
    }
}

public class demo {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen pen2 = new pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        pen1.printcolor();
        pen2.printcolor();
        pen1.printcolor();
        pen2.printtype();
    }

}
