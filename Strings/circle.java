import java.util.Scanner;
public class circle {
 public static void main(String[] args) {
    System.out.print("ENTER RADIUS : ");
    Scanner sc = new Scanner(System.in);
    double pie = 3.14F;
    double radius = sc.nextDouble();
    double perimeter = 2 * (pie * radius);
    System.out.println("YOUR PERIMETER IS : " + perimeter);
    double area = pie*(radius*radius); 
    System.out.println("YOUR AREA IS : " + area);
 }   
}
