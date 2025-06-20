import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        do {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'low', 'high', or 'correct': ");
            feedback = scanner.nextLine().trim().toLowerCase();

            if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }

        } while (!feedback.equals("correct"));

        System.out.println("Yay! I guessed your number.");
        scanner.close();
    }

    public static int generateGuess(int low, int high) {
        return (low + high) / 2; 
    }
}
