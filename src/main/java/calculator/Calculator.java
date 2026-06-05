package calculator;

public class Calculator {

    public int calculate(int a, int b, String opt) {
        switch (opt) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            case "^":
                return (int) Math.pow(a, b);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + opt);
        }
    }
}
