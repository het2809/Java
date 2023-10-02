abstract class Animals {
    abstract void walk();
}

class Horse {
    public void walk() {
        System.out.println("Horse Is Walking With 4 Legs");
    }
}

class Chiken {
    public void walk() {
        System.out.println("Chiken Is Walking With 2 Legs");

    }
}

public class abstract_method {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Animals animals = new Animals();
        animals.walk();
    }
}
