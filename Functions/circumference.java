import java.util.Scanner;

public class circumference {
    public static float getCircumference(float radius) {
        return 2 * 3.14f * radius;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(getCircumference(r));
    }
}
