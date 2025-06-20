import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms for Fibonacci sequence: ");
        int terms = scanner.nextInt();
        printFibonacciSequence(terms);
        scanner.close();
    }

    public static void printFibonacciSequence(int terms) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
