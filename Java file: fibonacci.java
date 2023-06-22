import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = getValidInput(scanner);
        printFibonacciSequence(number);
        scanner.close();
    }

    private static int getValidInput(Scanner scanner) {
        int number = 0;
        boolean isValidInput = false;
        do {
            try {
                System.out.print("Enter a positive integer: ");
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                } else {
                    isValidInput = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        } while (!isValidInput);
        return number;
    }

    private static void printFibonacciSequence(int number) {
        System.out.println("Fibonacci sequence up to " + number + ":");
        System.out.print("0");

        int previous = 0;
        int current = 1;

        while (current <= number) {
            System.out.print(", " + current);
            int next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println();
    }
}
