import java.util.Scanner;

public class demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[7];
        marks[0] = sc.nextFloat();
        marks[1] = sc.nextFloat();
        marks[2] = sc.nextFloat();
        marks[3] = sc.nextFloat();
        marks[4] = sc.nextFloat();
        marks[5] = sc.nextFloat();
        marks[6] = sc.nextFloat();
        float total = ((marks[0] + marks[1] + marks[2] + marks[3] + marks[4] +
                marks[5] + marks[6]) / 7);
        System.out.println(total);
    }
}
