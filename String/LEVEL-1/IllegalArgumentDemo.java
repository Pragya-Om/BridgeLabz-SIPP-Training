import java.util.Scanner;

public class IllegalArgumentDemo {

   
    public static void generateException(String text) {
        System.out.println("\n[generateException] Trying substring with invalid indices...");
      
        String result = text.substring(5, 2); 
        System.out.println("Substring: " + result);  
    }

   
    public static void handleException(String text) {
        System.out.println("\n[handleException] Trying substring with invalid indices and handling exception...");
        try {
            String result = text.substring(5, 2); 
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(" Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a general RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userText = input.nextLine();

        try {
            generateException(userText);
        } catch (IllegalArgumentException e) {
            System.out.println(" Exception occurred in generateException(): " + e);
        }

        handleException(userText);

        input.close();
    }
}
