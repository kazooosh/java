import java.util.Scanner;

public class portoCalc {
    public static void main(String[] args) {
        double porto = 2;
        double postage = 3;
        Scanner myObj = new Scanner(System.in);

        System.out.println("Auftragshöhe:");
        double sum = myObj.nextDouble();
        myObj.close();

        if (sum > 0) {
            if (sum > 100) {
                if (sum > 200) {
                    porto = 0;
                    postage = 0;
                }
                else {
                    porto = 0;
                    postage = 2;
                }
            }
            else {
                porto = 3;
                postage = 2;
            }
        }
        else {
            System.out.println("Warenkorb ist leer.");
        }

        double finalSum = sum + porto + postage;

        System.out.println("Auftragshöhe: " + sum + " EUR");
        System.out.println("Verpackungszuschlag: " + postage + " EUR");
        System.out.println("Porto: " + porto + " EUR");
        System.out.println("Endpreis: " + finalSum + " EUR");
    }
}