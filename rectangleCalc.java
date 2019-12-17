import java.util.Scanner;

public class rectangleCalc {
    public static void main(String[] args) {
        boolean i = true;

        do {
            Scanner myObj = new Scanner(System.in);
            Scanner myObj2 = new Scanner(System.in);

            System.out.println("erste Seite:");
            double a = myObj.nextDouble();
            System.out.println("zweite Seite:");
            double b = myObj.nextDouble();

            double area = a * b;
            double girth = 2 * (a + b);
            double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

            System.out.println("Die Fläche beträgt: " + area + "cm2");
            System.out.println("Der Umfang beträgt: " + girth + "cm");
            System.out.println("Die Länge der Diagonale beträgt: " + diagonal + "cm");

            System.out.println("Wollen Sie noch ein Rechteck berechnen? (Ja/Nein)");
            String anotherOne = myObj2.nextLine();

            if (anotherOne.equalsIgnoreCase("ja")) {
                i = true;
            }
            else {
                myObj.close();
                myObj2.close();
                i = false;
            }
        }
        while (i);
    }
}