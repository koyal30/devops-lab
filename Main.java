import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        System.out.print("Enter first number: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        System.out.print("Enter second number: ");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }

        System.out.println("\nChoose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid choice input.");
            return;
        }

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition of two numbers is " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction of two numbers is " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication of two numbers is " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Division of two numbers is " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
    }
}
