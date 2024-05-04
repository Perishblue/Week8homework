package question9;

public class Answer9 {
    //Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

    public static void main(String[] args) {
        int n = 8, firstTerm = 1, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
