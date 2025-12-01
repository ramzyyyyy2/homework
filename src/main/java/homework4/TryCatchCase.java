package homework4;

public class TryCatchCase {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            int division = calculator.divide(10, 0);
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero!");
        }
    }
}
// ya stvoryv metod dilennya u classi calculator