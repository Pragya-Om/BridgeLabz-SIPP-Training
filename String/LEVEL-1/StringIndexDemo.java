import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text) {
        System.out.println("\n[generateException] Trying to access index beyond string length...");
    
        System.out.println("Character at position 100: " + text.charAt(100));
    }
    public static void handleException(String text) {
        System.out.println("\n[handleException] Trying to access index with exception handling...");
        try {
            System.out.println("Character at position 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userText = input.nextLine();
        try {
            generateException(userText);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(" Exception occurred in generateException(): " + e);
        }
        handleException(userText);

        input.close();
    }
}
