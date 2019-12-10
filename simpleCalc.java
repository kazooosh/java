import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("erste Zahl:");
        int firstInput = myObj.nextInt();
        System.out.println("Rechenoperator:");
        char operator = myObj.next().charAt(0);
        System.out.println("zweite Zahl:");
        int secondInput = myObj.nextInt();
        myObj.close();


        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            if (operator == '+') {
                int sum = firstInput + secondInput;
                System.out.println("Ergebnis: " + sum);
            }
            if (operator == '-') {
                int difference = firstInput - secondInput;
                System.out.println("Ergebnis: " + difference);
            }
            if (operator == '*') {
                int product = firstInput * secondInput;
                System.out.println("Ergebnis: " + product);
            }
            if (operator == '/') {
                if (secondInput != 0) {
                    int quotient = firstInput / secondInput;
                    System.out.println("Ergebnis: " + quotient);
                }
                else {
                    System.out.println("Dividieren durch 0 ist nicht möglich.");
                }
            }
        }

        else {
            System.out.println("Kein gültiger Rechenoperator.");
        }
    }
}