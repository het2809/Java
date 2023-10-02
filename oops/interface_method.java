interface Animal {
    void walk();
}

class Horse1 implements Animal {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class interface_method {
    public static void main(String args[]) {
        Horse1 horse1 = new Horse1();
        horse1.walk();
    }
}
