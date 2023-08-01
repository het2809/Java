import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
       Scanner InputNumber = new Scanner(System.in);
       System.out.println("Enter Number 1");
       int a = InputNumber.nextInt();
       System.out.println("Enter Number 2");
       int b = InputNumber.nextInt();
       int sum = a+b;
       int minus = a-b;
       int multiplication = a*b;
       int divison = a/b;
       int mod = a%b;

       System.out.println(a + "+" + b + "=" + sum);
       System.out.println(a + "-" + b + "=" +minus);
       System.out.println(a + "*" + b + "=" +multiplication);
       System.out.println(a + "/" + b + "=" +divison);
       System.out.println(a +"%"  + b + "=" +mod);
    }
}
