public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{
            Math.sin(radians),
            Math.cos(radians),
            Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] trig = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trig[0]);
        System.out.println("Cosine: " + trig[1]);
        System.out.println("Tangent: " + trig[2]);
    }
}
