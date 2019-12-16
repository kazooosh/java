import java.util.Scanner;

public class astrology {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tag: ");
        int day = input.nextInt();
        System.out.print("Monat: ");
        int month = input.nextInt();

        switch (day / 10) {
            case 0: 
                System.out.print("In der Familie ");
                break;
            case 1: 
                System.out.print("In der Partnerschaft ");
                break;
            case 2: 
                System.out.print("Im Berufsleben ");
                break;
            case 3: 
                System.out.print("In der Liebe ");
                break;
            default: 
                System.out.print("Fehler in der Zehnerstelle des Tages!");
                break;
        }
        switch (day % 10) {
            case 0: 
                System.out.print("In der Familie ");
                break;
            case 1: 
                System.out.print("In der Partnerschaft ");
                break;
            case 2: 
                System.out.print("Im Berufsleben ");
                break;
            case 3: 
                System.out.print("In der Liebe ");
                break;
            default: 
                System.out.print("Fehler in der Zehnerstelle des Tages!");
                break;
        }
    }
}