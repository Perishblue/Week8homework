package question8;

import java.util.Scanner;

public class Answer8 {
   /* Display right angle triangle of @ using nested for loops
    @
    @@
    @@@
    @@@@
    @@@@@*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
