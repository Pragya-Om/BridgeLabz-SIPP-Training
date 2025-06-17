public class MaximumHandshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.println("Maximum handshakes: " + calculateHandshakes(n));
    }
}
