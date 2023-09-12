import java.util.Scanner;

public class removeduplicate {
    public static boolean map[] = new boolean[26];

    public static void rmduplicate(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currelement = str.charAt(idx);
        if (map[currelement - 'a']) {
            rmduplicate(str, idx + 1, newString);
        } else {
            newString += currelement;
            map[currelement - 'a'] = true;
            rmduplicate(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        rmduplicate(str, 0, "");
    }
}
