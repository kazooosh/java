import java.util.Scanner;

public class savingsCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Warenkorb:");
        double sum = myObj.nextInt();

        System.out.println("Davon gekennzeichnete Produkte:");
        int specialArticles = myObj.nextInt();

        myObj.close();

        if (specialArticles != 0) {
            specialArticles  *= 1.1;
            sum += specialArticles;
        }
        if (sum <= 20) {
            sum +=  3.5;
        }
        if (sum >= 200) {
            sum *= 1.5;
        }

        System.out.println("Summe: " + sum);

    }
}