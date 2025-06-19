import java.util.Scanner;

public class StringComparer {

   
    public static boolean compareUsingCharAt(String str1, String str2) {
    
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        boolean charAtResult = compareUsingCharAt(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("\nComparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);
        System.out.println("\nAre both strings equal? " + charAtResult + " | " + equalsResult);
        if (charAtResult == equalsResult) {
            System.out.println("Both methods returned the same result.");
        } else {
            System.out.println(" Methods returned different results.");
        }

        input.close(); 
    }
}
