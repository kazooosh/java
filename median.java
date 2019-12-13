import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        int n = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of numbers you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the numbers:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        if (a.length % 2 == 0) {
            int median = (a[a.length/2] + a[a.length/2 - 1]) / 2;
            System.out.println("Median: " + median);
        }
        else {
            int median = a[a.length/2];
            System.out.println("Median: " + median);
        }
        s.close();
    }
}