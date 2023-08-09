public class demo {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == x || j == y) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }

            }
            x++;
            y--;
            System.out.print("\n");
        }
        x = 1;
        y = 9;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == x || j == y || i == 0 && j == 5) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }

            }
            x++;
            y--;
            System.out.print("\n");
        }
    }
}
