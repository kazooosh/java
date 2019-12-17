import java.util.Scanner;

public class stringUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie einen Namen ein: ");
        String word = input.nextLine();
        input.close();
        String[] lastName = word.split(" ");
        System.out.println(lastName[0].substring(0, 1).toUpperCase() + lastName[0].substring(1) + " " + lastName[1].toUpperCase());
    }
}