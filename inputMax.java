import java.util.Scanner;
import java.lang.Math;

public class inputMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben sie die erste Zahl ein: ");
        int firstInput = input.nextInt();
        System.out.print("DGeben sie die zweite Zahl ein: ");
        int secondInput = input.nextInt();
        System.out.print("DGeben sie die dritte Zahl ein: ");
        int thirdInput = input.nextInt();
        input.close();

        int max = Math.max(Math.max(firstInput, secondInput), thirdInput);

        System.out.println("Die höchste Zahl ist: " + max);
    }
}