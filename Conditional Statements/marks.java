import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SUBJECT 1 ");
        int sub1 = sc.nextInt();
        System.out.println("ENTER SUBJECT 2 ");
        int sub2 = sc.nextInt();
        System.out.println("ENTER SUBJECT 3 ");
        int sub3 = sc.nextInt();
        int total = (sub1+sub2+sub3)/3;
    
        if ( total >= 40 && sub1 >= 33  && sub2 >=33 && sub3 >=33  ) {
            System.out.println("PASS");
            System.out.println(total + "%");
        } else {
            System.out.println("FAIL");           
        }
      
    }
}   
