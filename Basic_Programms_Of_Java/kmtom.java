import java.util.Scanner;

 
public class kmtom{
    public static void main(String[] args) {
    
        System.out.println("Enter Killometers");
        Scanner killometer = new Scanner(System.in);
        int km = killometer.nextInt();
        System.out.println(km*0.621371);

}
}
