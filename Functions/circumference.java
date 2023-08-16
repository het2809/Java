import java.util.Scanner;

public class circumference {
    public static void circumference(float radius) {
        System.out.print("Enter radius for circumference function : ");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float pie = 3.14f;
        float circle = 2 * pie * rad;
        System.out.print("circumference of circle is : ");
        System.out.print(circle);
    }

    public static void main(String[] args) {
        System.out.print("Enter radius for main function : ");
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        circumference(rad);

    }
}
