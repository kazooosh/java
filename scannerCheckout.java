import java.util.Scanner;

public class scannerCheckout {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Scannerkassen: ");
        int scanners = input.nextInt();
        System.out.print("Einzelpreis: ");
        double price = input.nextDouble();
        System.out.print("Kategorie: ");
        int category = input.nextInt();
        double discount = 0;
        input.close();

        switch (category) {
            case 1:
                discount = 10;
                break;
            case 2: 
                discount = 12; 
                break;
            case 3: 
                discount = 20; 
                break;
            default: 
                discount = 0; 
                break;
        }
        
        double discountCalc = 1 - discount / 100;

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Scannerkassen: " + scanners);
        System.out.println("Einzelpreis: " + price);
        System.out.println("Kategorie: " + category);
        System.out.println("Rabattsatz: " + discount + "%");
        System.out.println("Rabattbetrag: " + (scanners * (price - (price * discountCalc))));
        System.out.println("Gesamtpreis: " + (scanners * (price * discountCalc)));
    }
}