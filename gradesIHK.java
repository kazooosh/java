import java.util.Scanner;

public class gradesIHK {
    public static void main(String[] args) {
        boolean i = true;

        Scanner inputNumber = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        System.out.print("Geben Sie die maximal zu erreichende Punktzahl ein: ");
        double maxPoints = inputNumber.nextDouble();

        do {
            System.out.print("Geben Sie die erreichte Punktzahl ein: ");
            double points = inputNumber.nextDouble();
            double gradePercent = points / maxPoints * 100;
            System.out.println("Prozent: " + Math.round(gradePercent) + "%");
            int grade = 0;

            if (gradePercent >= 50) {
                if (gradePercent >= 60) {
                    if (gradePercent >= 75) {
                        if (gradePercent >= 90) {
                            grade = 1;
                        }
                        else {
                            grade = 2;
                        }
                    }
                    else {
                        grade = 3;
                    }
                }
                else {
                    grade = 4;
                }
            }
            else {
                grade = 5;
            }

            System.out.println("Note: " + grade);

            System.out.println("Weitere Schueler? (Ja / Nein): ");
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