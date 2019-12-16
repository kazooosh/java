import java.util.Scanner;

public class astrology {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tag: ");
        int day = input.nextInt();
        System.out.print("Monat: ");
        int month = input.nextInt();
        input.close();
        String prediction = "";

        switch (day / 10) {
            default:
            case 0:
                prediction += "In der Familie ";
                break;
            case 1:
                prediction += "In der Partnerschaft ";
                break;
            case 2:
                prediction += "Im Berufsleben ";
                break;
            case 3:
                prediction += "In der Liebe ";
                break;
        }
        switch (day % 10) {
            default:
            case 0:
                prediction += "fehlt Ihnen die Ausdauer. ";
                break;
            case 1:
                prediction += "kündigen sich Veränderungen an. ";
                break;
            case 2:
                prediction += "lassen Erfolge auf sich warten. ";
                break;
            case 3:
                prediction += "neigen Sie zur Bequemlichkeit. ";
                break;
            case 4:
                prediction += "müssen Sie mit unangenehmen Überraschungen rechnen. ";
                break;
            case 5:
                prediction += "sind Sie besonders kreativ. ";
                break;
            case 6:
                prediction += "befinden Sie sich in einer produk-tiven Phase. ";
                break;
            case 7:
                prediction += "eilen Sie von Erfolg zu Erfolg. ";
                break;
            case 8:
                prediction += "kann es zu einer Auseinanderset-zung kommen. ";
                break;
            case 9:
                prediction += "sind Sie besonders aktiv. ";
                break;
        }

        switch (month) {
            default:
            case 1:
                prediction += "Machen Sie weiter so!";
                break;
            case 2:
                prediction += "Lassen Sie sich nicht beeinflussen!";
                break;
            case 3:
                prediction += "Hören Sie auf den Rat eines Freun-des!";
                break;
            case 4:
                prediction += "Werden Sie nicht übermütig!";
                break;
            case 5:
                prediction += "Seien Sie weniger kritisch!";
                break;
            case 6:
                prediction += "Ab und zu eine Pause einlegen!";
                break;
            case 7:
                prediction += "Suchen Sie eine Aussprache!";
                break;
            case 8:
                prediction += "Denken Sie nicht nur an sich!";
                break;
            case 9:
                prediction += "Nicht immer nur an andere denken!";
                break;
            case 10:
                prediction += "Achten Sie auf Ihre Gesundheit!";
                break;
            case 11:
                prediction += "Geldausgaben verschieben!";
                break;
            case 12:
                prediction += "Idealer Zeitpunkt für einen Neuanfang!";
                break;
        }
        System.out.println(prediction);
    }
}