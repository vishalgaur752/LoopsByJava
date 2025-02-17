import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        // while(i <=100) {
        //     System.out.print("Hello World" + " ");
        //     i++;
        // }

        //print number from 1 to 10
        // while(i<=10) {
        //     System.out.println(i);
        //     i++;
        // }

        // print number from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // while(i<=n) {
        //     System.out.print(i+ " ");
        //     i++; 
        // }

        //Print sum of first n natural numbers
        int sum = 0;
        while(i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.print(sum + " ");
    }
} 