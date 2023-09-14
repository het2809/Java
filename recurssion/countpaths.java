public class countpaths {
    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // to down
        int downpaths = countpath(i + 1, j, n, m);

        // to right
        int rightpaths = countpath(i, j + 1, n, m);

        return downpaths + rightpaths;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(path(0, 0, n, m));
    }
}
