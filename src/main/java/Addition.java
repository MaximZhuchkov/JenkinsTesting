public class Addition {

    public static int sum(int first, int second) {
        return first + second;
    }

    public static int divide(int dividee, int divisor) {
        if(divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividee/divisor;
    }
}
