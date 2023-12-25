package Repetition.ArithmethicException;

public class DivByZero {

    public static void main(String[] args) {

        divisionByZero(5, 0);

    }

    public static double divisionByZero(int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return (double) a / b;
        } catch (ArithmeticException ae) {
            System.out.println("You cannot divide by zero");
            return Double.NaN;
        }
    }
}
