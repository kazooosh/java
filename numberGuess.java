import java.util.Scanner;
import java.util.Random;

public class numberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int minimum = 0; int maximum = 10;
        int randomNum = minimum + rand.nextInt((maximum - minimum) + 1);
        System.out.println(randomNum);

        while (i) {
            System.out.print("Eingabe: ");
            int userNum = input.nextInt();

            if (randomNum == userNum) {
                System.out.println("fertig");
                input.close();
                i = false;
            }
            if (randomNum > userNum) {
                System.out.println("zu gross");
            }
            if (randomNum < userNum) {
                System.out.println("zu klein");
            }
        }
    }
}