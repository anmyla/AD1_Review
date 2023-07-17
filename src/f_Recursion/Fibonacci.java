package f_Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print(calcFibonacci(7));
    }

    public static int calcFibonacci(int n) {
        int sum = 0;
        if (n <= 0) {
            return 0; // Base case: Fibonacci of 0 or negative number is 0
        } else {
            // Recursive case: Build the addition expression

            if (n == 1) {
                System.out.print(n + " = ");
            }else {
                System.out.print(n + " + " );
            }
            sum =  sum + (n + calcFibonacci(n-1));
        }
        return sum;
    }
}