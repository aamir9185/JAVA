
import java.io.IOException;

public class IOEx {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result of division: " + result);
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    private static int divideNumbers(int dividend, int divisor) throws IOException {
        if (divisor == 0) {
            throw new IOException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}
