import java.util.Scanner;

public class findVariable {
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
        System.out.print("Enter Number That You Want To Find : ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == x) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("Item Found");
        } else {
            System.out.println("Item Not Found");
        }
    }
}
