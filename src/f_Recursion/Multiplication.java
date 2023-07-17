package f_Recursion;

public class Multiplication {
    public static void main(String[] args) {
        System.out.print("\n8 * 6 --->  ");
        System.out.print(calcMultiplication(8,6));

        System.out.print("\n4 * 5 --->  ");
        System.out.print(calcMultiplication(4,5));

        System.out.print("\n0 * 4 --->  ");
        System.out.print(calcMultiplication(0,4));

        System.out.print("\n1 * 1 --->  ");
        System.out.print(calcMultiplication(1,1));

        System.out.print("\n1 * 0 --->  ");
        System.out.print(calcMultiplication(1,0));
    }


    public static int calcMultiplication(int multiplicand, int multiplier) {
        int sum = 0;
        if (multiplier <= 0) {
            return 0; // Base case: Fibonacci of 0 or negative number is 0
        } else {
            if (multiplier == 1) {
                System.out.print(multiplicand + " = ");
            }else {
                System.out.print(multiplicand + " + " );
            }
            sum =  multiplicand + calcMultiplication(multiplicand, multiplier-1);
        }
        return sum;
    }

}
