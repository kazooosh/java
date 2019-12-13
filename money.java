import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Startkapital: ");
        double startSum = input.nextDouble();
        System.out.print("Zinssatz: ");
        double interest = input.nextDouble();
        double finalSum = startSum*2;
        int years = 0;
        input.close();

        while (startSum < finalSum) {
            years++;
            startSum *= (interest/100+1);
        }
        System.out.println("Der eingesetzte Geldbetrag hat sich nach " + years + " Jahren verdoppelt.");
    }
}