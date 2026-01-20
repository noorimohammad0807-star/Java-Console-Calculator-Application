import java.util.Scanner;

class Calculator {
    int a, b;
    char operator;

    void inputValues(Scanner sc) {
        try {
            System.out.print("Enter the first number: ");
            a = sc.nextInt();

            System.out.print("Enter the second number: ");
            b = sc.nextInt();

            System.out.print("Enter the operator (+, -, *, /, %): ");
            operator = sc.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
            sc.nextLine(); // clear buffer
        }
    }

    void calculate() {
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + ((double) a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Modulo by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, /, %.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        cal.inputValues(sc);
        cal.calculate();
        sc.close();
    }
}