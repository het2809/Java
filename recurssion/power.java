public class power {
    public static int printPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        } else {
            return x * printPower(x, n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = printPower(x, n);
        System.out.println(ans);
    }
}
