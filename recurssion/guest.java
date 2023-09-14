public class guest {
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways1 = callGuest(n - 1);

        int ways2 = (n - 1) * callGuest(n - 2);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(callGuest(n));
    }
}
