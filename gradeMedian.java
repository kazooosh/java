import java.util.Scanner;

public class gradeMedian {
    public static void main(String[] args) {
        int gradeSum = 0;
        int count = 0;
        int gradeMedian = 0;

        Scanner myObj = new Scanner(System.in);

        while (count < 1) {
            System.out.println("Eingabe der Deutschnote: ");
            int gradeGerman = myObj.nextInt();
            if (gradeGerman > 6 || gradeGerman < 1) {
                System.out.println("Falsche Eingabe.");
                return;
            } else {
                if (gradeGerman == 6) {
                    System.out.println("Nicht bestanden aufgrund von ungeügender Leistung.");
                    return;
                } else {
                    gradeSum += gradeGerman;
                    count += 1;
                }
            }

            System.out.println("Eingabe der Englischnote: ");
            int gradeEnglish = myObj.nextInt();
            if (gradeEnglish > 6 || gradeGerman < 1) {
                System.out.println("Falsche Eingabe.");
                return;
            } else {
                if (gradeEnglish == 6) {
                    System.out.println("Nicht bestanden aufgrund von ungeügender Leistung.");
                    return;
                } else {
                    gradeSum += gradeEnglish;
                    count += 1;
                }
            }

            System.out.println("Eingabe der Mathenote: ");
            int gradeMath = myObj.nextInt();
        myObj.close();
            if (gradeMath > 6 || gradeMath < 1) {
                System.out.println("Falsche Eingabe.");
                return;
            } else {
                if (gradeMath == 6) {
                    System.out.println("Nicht bestanden aufgrund von ungeügender Leistung.");
                    return;
                } else {
                    gradeSum += gradeMath;
                    count += 1;
                }
            }
        }

        if (count == 3) {
            gradeMedian = gradeSum / count;
            if (gradeMedian <= 4.5) {
                System.out.println("Bestanden mit " + Math.round(gradeMedian));
            } else {
                System.out.println("Nicht Bestanden mit " + Math.round(gradeMedian));
            }
        }

        else {
            System.out.println("Nicht bestanden aufgrund von ungenügender Leistung.");
        }
    }
}