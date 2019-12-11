import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);


        boolean i = true;

        do {
            System.out.print("erste Zahl: ");
            int firstInput = inputNumber.nextInt();
            System.out.print("Rechenoperator: ");
            char operator = inputNumber.next().charAt(0);
            System.out.print("zweite Zahl: ");
            int secondInput = inputNumber.nextInt();
            switch (operator) {
                case '+': 
                    int sum = firstInput + secondInput;
                    System.out.println("Ergebnis: " + sum);
                    break;
                case '-': 
                    int difference = firstInput - secondInput;
                    System.out.println("Ergebnis: " + difference);
                    break;
                case '*': 
                    int product = firstInput * secondInput;
                    System.out.println("Ergebnis: " + product);
                    break;
                case '/': 
                    if (secondInput != 0) {
                        int quotient = firstInput / secondInput;
                        System.out.println("Ergebnis: " + quotient);
                    }
                    else {
                        System.out.println("Teilung durch 0 ist nicht möglich.");
                    }
                    break;
                default: System.out.println("Kein gültiger Rechenoperator.");
                break;
            }

            System.out.println("Weitere Berechnung (Ja / Nein): ");
            String anotherOne = inputText.nextLine();

            if (anotherOne.equalsIgnoreCase("ja")) {
                i = true;
            }
            else {
                inputNumber.close();
                inputText.close();
                i = false;
            }
        }
        while (i);
    }
}