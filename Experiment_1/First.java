import java.util.Scanner;

class Calculator {
    void add(int x, int y) {
        System.out.println("Sum is: " + (x + y));
    }

    void subtract(int x, int y) {
        System.out.println("Difference is: " + (x - y));
    }

    void multiply(int x, int y) {
        System.out.println("Product is: " + (x * y));
    }

    void divide(int x, int y) {
        if (y == 0) {
            System.out.println("Division by zero .");
        } else {
            System.out.println("Quotient is: " + (x / y));
        }
    }
}

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        int choice;

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers x and y: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                switch (choice) {
                    case 1:
                        calculator.add(x, y);
                        break;
                    case 2:
                        calculator.subtract(x, y);
                        break;
                    case 3:
                        calculator.multiply(x, y);
                        break;
                    case 4:
                        calculator.divide(x, y);
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
