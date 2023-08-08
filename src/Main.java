
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> sqrt = sqrt();
        double number = 12.0;
        double result = sqrt.apply(number);
        System.out.println("Number: " + number);
        System.out.println("Result: " + result);
    }

    public static UnaryOperator<Double> sqrt() {
        return x -> Math.sqrt(x);
    }
}

