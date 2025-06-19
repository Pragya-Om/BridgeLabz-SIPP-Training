import java.util.Scanner;
import java.util.InputMismatchException; 

public class ArrayIndexDemo {
    static void generateException(String[] names, int index) {
        System.out.println("Name: " + names[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};

        try {
            System.out.print("Enter an index (0-2): ");
            int index = sc.nextInt(); 
            generateException(names, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index");
        } catch (InputMismatchException e) {
            System.out.println("Caught InputMismatchException: Please enter an integer");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException");
        } finally {
            sc.close();
        }
    }
}
