import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, sqrt): ");
        String operator = scanner.next();

        double result;

        if (operator.equals("sqrt")) {
            result = Math.sqrt(num1);
            System.out.println("Result: " + result);
        } else {
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    return;
                default:
                    System.out.println("Error: Invalid operator");
                    return;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}