public class subsequence {
    public static void sub(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currelement = str.charAt(idx);
        // TO BE
        sub(str, idx + 1, newString + currelement);
        // NOT TO BE
        sub(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        sub(str, 0, "");
    }

}