public class DivisionProgram {
    public static void main(String[] args) {
        try {
            divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void divideNumbers(int numerator, int denominator) {
        if (denominator == 0) throw new ArithmeticException("Division by zero is not allowed");
        System.out.println("Result of division: " + (numerator / denominator));
    }
}