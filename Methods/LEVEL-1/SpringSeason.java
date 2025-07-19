public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter month and day: ");
        int month = sc.nextInt(), day = sc.nextInt();
        System.out.println(isSpringSeason(month, day) ? "It's a Spring Season" : "Not a Spring Season");
    }
}
