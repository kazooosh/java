import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class dayCheck {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);
        boolean success = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date (dd/MM/yyyy): ");
        String date = input.nextLine();
        input.close();
        try {
            format.parse(date);
            success = true;
        } catch (ParseException e) {
            System.out.println("Date " + date + " is not valid according to " +
                ((SimpleDateFormat) format).toPattern() + " pattern.");
        }
        if (success){
            System.out.println("Date " + date + " is valid.");
        }
    }
}