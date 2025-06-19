import java.util.Scanner;

public class CharArrayComparer {

    public static char[] getCharactersFromString(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = input.next();

        
        char[] userDefinedChars = getCharactersFromString(text);

        char[] builtInChars = text.toCharArray();

        
        boolean result = compareCharArrays(userDefinedChars, builtInChars);

        
        System.out.print("\nUser-defined method result: ");
        for (char ch : userDefinedChars) {
            System.out.print(ch + " ");
        }

        System.out.print("\nBuilt-in method result:     ");
        for (char ch : builtInChars) {
            System.out.print(ch + " ");
        }

        System.out.println("\n\nAre both arrays equal? " + result);
        if (result) {
            System.out.println(" Both methods returned the same characters.");
        } else {
            System.out.println("The methods returned different characters.");
        }

        input.close();
    }
}
