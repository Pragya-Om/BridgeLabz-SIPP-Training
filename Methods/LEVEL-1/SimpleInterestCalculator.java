
public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Principal, Rate and Time: ");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + si + 
            " for Principal " + principal + 
            ", Rate of Interest " + rate + 
            " and Time " + time);
    }
}