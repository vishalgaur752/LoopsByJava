
import java.util.Scanner;

public class DoWhileloops {
    public static void main(String[] args) {
        int i = 1;
        // do { 
        //     System.out.println("Hello World");
        //     i++;
        // } while (i<=5);

        // Scanner sc = new Scanner(System.in);
        // do {
        //     int n = sc.nextInt();
        //     if(n % 10 == 0){
        //         break;
        //     }else {
        //         System.out.println(n);
        //     }
            
        // } while(true);

        //display all number enter bu user except multiples of 10
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }else {
                System.out.println(n);
            }
            
        } while(true);
    }
}
