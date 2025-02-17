public class ForLoops {
    public static void main(String args[]) {
        // for (int i = 0; i<10; i++) {
        //     System.out.print(i + " ");
        // }

        //print square pattern
        // for(int i = 1; i<=4; i++) {
        //     System.out.println("****");
        // }

        //print reverse of a number {
        int n = 10899;
        // int lastDigigt;
        // for(int i = 0; n>0; i++) {
        //     lastDigigt = n %10;
        //     n = n/10;
        //     System.out.print(lastDigigt);
        // }


        //Reverse the given number
        int lastDigit;
        int rev = 0;
        for(int i = 0; n>0; i++) {
            lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n = n/10;
        }
        System.out.print(rev);
    }
}
