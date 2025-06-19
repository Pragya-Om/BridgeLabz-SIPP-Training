import java.util.Scanner;

public class SubstringComparer {

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
        }

        return result;
    }

    
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

        System.out.print("Enter the original text: ");
        String text = input.nextLine();

       
        System.out.print("Enter start index: ");
        int start = input.nextInt();

        System.out.print("Enter end index: ");
        int end = input.nextInt();

        if (start < 0 || end > text.length() || start >= end) {
            System.out.println(" Invalid start or end index.");
            input.close();
            return;
        }

        
        String customSubstring = createSubstringUsingCharAt(text, start, end);
        String builtinSubstring = text.substring(start, end);

        boolean comparisonResult = compareUsingCharAt(customSubstring, builtinSubstring);

       
        System.out.println("\nCustom Substring (charAt): " + customSubstring);
        System.out.println("Built-in Substring:        " + builtinSubstring);
        System.out.println("Comparison Result:         " + comparisonResult);

        if (comparisonResult) {
            System.out.println(" Both substrings are equal.");
        } else {
            System.out.println("Substrings are different.");
        }

        input.close();
    }
}
