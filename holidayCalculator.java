import java.util.Scanner;

public class holidayCalculator {
    public static void main(String[] args) {
        int holidays = 30;

        Scanner myObj = new Scanner(System.in);


        System.out.println("Eingabe Alter:");
        int age = myObj.nextInt();

        if (age < 16 || age > 67) {
            System.out.println("Fehler!");
            myObj.close();
            return;
        }
        else {
            if (age < 18) {
                holidays += 5;
            }
            else {
                if (age >= 52) {
                    holidays += 2;
                }
            }
            System.out.println("Eingabe des Behinderungsgrades in Prozent:");
            int disability = myObj.nextInt();

            if (disability < 0 || disability > 100) {
                System.out.println("Fehler");
                myObj.close();
                return;
            }

            else {
                if (disability >= 50) {
                    holidays += 5;
                }
            }
        }
        myObj.close();

        System.out.println(holidays + " Tage.");
    }
}