import java.util.Scanner;
import java.util.Random;

public class numberGuess {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        Random rand = new Random();
        int minimum = 0; int maximum = 10;
        int randomNum = minimum + rand.nextInt((maximum - minimum) + 1);
        boolean i = true;
        int counter = 0;

        while (i) {
            System.out.print("Geben Sie eine Zahl zwischen " + minimum + " und " + maximum + " ein: ");
            int userNum = inputNumber.nextInt();

            counter++;
            if (randomNum == userNum) {
                System.out.println("Richtig geraten!");
                System.out.println("Sie haben " + counter + " Versuche benoetigt.");
                System.out.print("Wollen Sie noch einmal spielen? (Ja / Nein): ");
                String anotherOne = inputText.nextLine();
                if (anotherOne.equalsIgnoreCase("ja")) {
                    counter = 0;
                    i = true;
                }
                else {
                    inputNumber.close();
                    inputText.close();
                    i = false;
                }
            }
            if (randomNum < userNum) {
                System.out.println("Zu hoch geraten!");
            }
            if (randomNum > userNum) {
                System.out.println("Zu niedrig geraten!");
            }
        }
    }
}