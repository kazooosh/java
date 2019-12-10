import java.util.Scanner;
import java.lang.Math;

public class inputMax {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Geben sie die erste Zahl ein:");
        int firstInput = myObj.nextInt();
        System.out.println("DGeben sie die zweite Zahl ein:");
        int secondInput = myObj.nextInt();
        System.out.println("DGeben sie die dritte Zahl ein:");
        int thirdInput = myObj.nextInt();
        myObj.close();

        int max = Math.max(Math.max(firstInput, secondInput), thirdInput);

        System.out.println("Die höchste Zahl ist: " + max);
    }
}