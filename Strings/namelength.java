import java.util.Scanner;
public class namelength {
    public static void main(String[] args) {
        System.out.printf("Enter Your Name :");
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        int value = name.length();
        System.out.println(value); 

    }
}
