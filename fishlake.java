import java.util.Scanner;

public class fishlake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("fishStart: ");
        double fishStart = input.nextDouble();
        System.out.print("fishEnd: ");
        double fishEnd = input.nextDouble();
        System.out.print("fishAdd: ");
        double fishAdd = input.nextDouble();
        System.out.print("percentage: ");
        double percentage = input.nextDouble();
        double weeks = 0;
        double perc = 1 - percentage / 100;

        while (fishStart >= fishEnd || weeks >= 50) {
            fishStart *= perc;
            fishStart += fishAdd;
            fishStart = Math.round(fishStart);
            weeks++;
            System.out.println("Woche " + weeks + ": " + fishStart);
        }
        input.close();
    }
}