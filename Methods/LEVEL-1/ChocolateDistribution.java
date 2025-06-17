public class ChocolateDistribution {
    public static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter chocolates and children: ");
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] result = distribute(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining: " + result[1]);
    }
}
