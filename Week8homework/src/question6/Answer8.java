package question6;

import java.util.Scanner;

public class Answer8 {
   /* 6. Write a program in Java to display the pattern like a triangle with a number.
    For eg.
    Input number of rows: 10
    Expected Output:
            1
            12
            123
            1234
            12345
            123456
            1234567
            12345678
            123456789
            12345678910*/

    public static void main(String[] args) {
        System.out.println("Type in an integer value");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String str = "";
        for(int i=1;i<=input;i++){
            str += i;
            System.out.println(str);
        }
    }
}
