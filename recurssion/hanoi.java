public class hanoi {
    public static void towerofhanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " To " + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, help);
        System.out.println("Tranfer Disk " + n + " from " + src + " To " + dest);
        towerofhanoi(n - 1, help, src, dest);
        System.out.println("Transfer Disk " + n + " from " + src + " To " + dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, "S", "H", "D");
    }
}
