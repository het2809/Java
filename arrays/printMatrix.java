import java.util.Scanner;

public class printMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Row : ");
        int row = sc.nextInt();
        System.out.print("Enter Size Of Column : ");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("Enter Elements Of Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
