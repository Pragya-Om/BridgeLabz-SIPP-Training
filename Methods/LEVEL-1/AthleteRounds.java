public class AthleteRounds {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter three sides of triangle: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        System.out.println("Rounds to complete 5km: " + calculateRounds(a, b, c));
    }
}
