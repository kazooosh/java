import java.util.Scanner;

public class stringFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie ein Wort ein: ");
        String word = input.nextLine();
        System.out.println(word);
        input.close();
        char[] ch = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            ch[i] = word.charAt(i);
        }
        for (char c : ch) {
            System.out.println(c);
        }
    }
}