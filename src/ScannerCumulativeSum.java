import java.util.*;

public class ScannerCumulativeSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.print("Type a number: ");
            sum = sum + console.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}