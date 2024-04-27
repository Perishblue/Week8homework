import java.util.Scanner;

public class MinandMaxInputChallenge {
    /*-Read the numbers from the console entered by the user and print the minimum
    and maximum number the user has entered.
-Before the user entersthe number, print the message Enter number:
            -If the user enters an invalid number, break out of the loop and print the minimum and maximum
    number.
            Hint:
            -Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstnumber = true;
        System.out.println("Enter number any non number to finish");
        while (true){
            System.out.println("Enter number");
            if (in.hasNextInt()) {
                int number = in.nextInt();
                if (firstnumber) {
                    min = number;
                    max = number;
                    firstnumber = false;
                } else {
                    min = Math.min(min, number);
                    max = Math.max(max, number);
                }
            }
                else {
                    System.out.println("Invalid number");
                    break;
                }
            }
        }



}
