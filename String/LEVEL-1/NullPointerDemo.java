public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println(" Caught NullPointerException: Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Trying to generate exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println(" Exception occurred in generateException(): " + e);
        }

        System.out.println("\nNow handling exception properly:");
        handleException();
    }
}
