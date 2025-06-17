public class SumNaturalNumbers {
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) result += i;
        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum = " + sum(n));
    }
}
