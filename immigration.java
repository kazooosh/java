import java.util.Scanner;

public class immigration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean i = true;
        String employee = "Herr Mustermann";
        int room = 111;
        while(i) {
            System.out.print("Name: ");
            String name = input.nextLine();
            // String firstLetter = name.substring(0, 1).toUpperCase();
            char firstLetter = name.charAt(0);
            if (firstLetter >= 'A' && firstLetter <= 'E' || firstLetter >= 'a' && firstLetter <= 'e' ) {
                employee = "Frau Hoffenheim";
                room = 101;
            }
            if (firstLetter >= 'F' && firstLetter <= 'I' || firstLetter >= 'f' && firstLetter <= 'i' ) {
                employee = "Herr Müller";
                room = 102;
            }
            if (firstLetter >= 'J' && firstLetter <= 'O' || firstLetter >= 'j' && firstLetter <= 'o' ) {
                employee = "Frau Tunichgut";
                room = 103;
            }
            if (firstLetter >= 'P' && firstLetter <= 'T' || firstLetter >= 'p' && firstLetter <= 't' ) {
                employee = "Herr Grün";
                room = 104;
            }
            if (firstLetter >= 'U' && firstLetter <= 'Z' || firstLetter >= 'u' && firstLetter <= 'z' ) {
                employee = "Frau Kahrs";
                room = 105;
            }
            else {
                System.out.println("Kein akzeptierter Buchstabe.");
            }
            String flavor = "Ihr Berater ist " + employee + ", Zimmer " + room;
            System.out.println(flavor);
            
            System.out.print("Weitere (Ja/Nein): ");
            String anotherOne = input.nextLine();

            if (anotherOne.equalsIgnoreCase("ja")) {
                i = true;
            }
            else {
                input.close();
                i = false;
            }
        }
    }
}