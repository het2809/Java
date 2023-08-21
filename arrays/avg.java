import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;
        int avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter Elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Your Elements Are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
            sum = arr[i] + sum;
            avg = sum / size;
        }
        System.out.println();
        System.out.println("Sum of array is : " + sum);
        System.out.println("Averag Of array is : " + avg);
    }

}
