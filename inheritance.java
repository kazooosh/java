import java.util.Scanner;

public class inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Startkapital: ");
        double capital = input.nextDouble();
        System.out.print("Zinssatz: ");
        double interest = input.nextDouble();
        System.out.print("Jahre: ");
        int yearsStart = 0;
        int yearsEnd = input.nextInt();;
        input.close();

        while (yearsStart < yearsEnd) {
            capital *= (interest/100+1);
            capital = Math.round(capital*100.0)/100.0;
            yearsStart++;
            System.out.println("Jahr " + yearsStart + ": " + capital);
        }
    }
}