import java.util.Scanner;

public class letterGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben sie eine Note ein (1-6): ");
        int grade = input.nextInt();
        input.close();
        switch (grade) {
            case 1: System.out.println("sehr gut"); break;
            case 2: System.out.println("gut"); break;
            case 3: System.out.println("befriedigend"); break;
            case 4: System.out.println("ausreichend"); break;
            case 5: System.out.println("mangelhaft"); break;
            case 6: System.out.println("ungenügend"); break;
            default: System.out.print("Keine gültige Note"); break;
        }
    }
}