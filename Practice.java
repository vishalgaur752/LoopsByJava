
import java.util.*;

public class Practice {

    public static void main(String[] args) {
        // for(int i=0; i<5; i++) {
        //     System.out.println("Hello");
        //     i+=2;
        // }

        Scanner sc = new Scanner(System.in);
        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;
        // do {
        //     System.out.print("Enter the number ");
        //     number = sc.nextInt();
        //     if (number % 2 == 0) {
        //         evenSum += number;
        //     } else {
        //         oddSum += number;
        //     }
        //     System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
        //     choice = sc.nextInt();
        // } while (choice == 1);
        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);

        // int n = sc.nextInt();
        // int factoriall = 1;
        // for (int i = 1; i <= n; i++) {
        //     factoriall *= i;
        // }
        // System.out.println(factoriall);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
