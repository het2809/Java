import java.util.Scanner;

public class average {
    public static float calculateAvg(float num1, float num2, float num3) {
        float avg = (num1 + num2 + num3) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        sc.close();
        float avg = calculateAvg(num1, num2, num3);
        System.out.println("The Average Of Three Number Is : " + avg);
    }
}
