import java.util.Scanner;
import java.util.Random;

public class rockpaperscissor {
    public static void main(String[] args) {

        int rock = 1;
        int paper = 2;
        int scissor = 3;
        System.out.println("Hello sir, Welcome to our rock , paper , seissor game\n" + "Enter 1 for Rock\n"
                + "Enter 2 for Paper\n" + "Enter 3 for seissor");
        Scanner sc = new Scanner(System.in);
        int userinput = sc.nextInt();
        Random var = new Random();
        int computerinput = var.nextInt(1, 3);
        switch (userinput) {
            case 1 -> System.out.println("You choose Rock");
            case 2 -> System.out.println("You choose paper");
            case 3 -> System.out.println("You choose seissor");
            default -> System.out.println("please select valid input");
        }
        if (userinput <= 3) {
            switch (computerinput) {

                case 1 -> System.out.println("Computer choose Rock");
                case 2 -> System.out.println("Computer choose paper");
                case 3 -> System.out.println("Computer choose seissor");
            }
        }

        else {
            System.out.println("");
        }
        if (userinput == 1 && computerinput == 2) {
            System.out.println("Computer won!");
        } else if (userinput == 2 && computerinput == 3) {
            System.out.println("Computer won!");
        } else if (userinput == 3 && computerinput == 1) {
            System.out.println("Computer won!");
        } else if (userinput > 3) {
            System.out.println("It is an invalid input game cant be proceed furthur");

        } else {
            System.out.println("Congrats! you won the match");

        }
    }
}
