import java.util.Scanner;

public class moveX {
    public static void moveAllX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i <= count; i++) {
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currelement = str.charAt(idx);
        if (currelement == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newString);
        } else {
            newString += currelement;
            moveAllX(str, idx + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String str = sc.nextLine();
        moveAllX(str, 0, 0, "");
    }

}