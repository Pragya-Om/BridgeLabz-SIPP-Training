import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter coffee type (Espresso, Cappuccino, Latte, Mocha) or type 'exit' to stop: ");
            String coffeeType = sc.nextLine().trim();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting Ravi's Cafe");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();  

            double price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;
                case "cappuccino":
                    price = 120;
                    break;
                case "latte":
                    price = 130;
                    break;
                case "mocha":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type! Try again.");
                    continue;
            }

            double total = price * quantity;
            double gst = total * 0.18;
            double finalBill = total + gst;

            System.out.printf("Total: ₹%.2f, GST: ₹%.2f, Final Bill: ₹%.2f%n", total, gst, finalBill);
        }

        sc.close();
    }
}
