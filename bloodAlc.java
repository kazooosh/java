import java.util.Scanner;

public class bloodAlc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie Ihren Promillewert ein: ");
        double promille = input.nextDouble();
        System.out.print("Stunden: ");
        int hoursEnd = input.nextInt();
        int hoursStart = 0;

        while (hoursStart < hoursEnd) {
            promille *= 0.8;
            hoursStart++;
            System.out.println(hoursStart + ". Stunde: " + promille);
        }
        input.close();
    }
}