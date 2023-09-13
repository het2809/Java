public class permutation {
    public static void printperm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currelement = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printperm(newString, permutation + currelement);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printperm(str, "");
    }

}