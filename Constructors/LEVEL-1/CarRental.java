class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double ratePerDay = 1000.0;

    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    
    double calculateCost() {
        return rentalDays * ratePerDay;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateCost());
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Bob", "Toyota Innova", 5);

        defaultRental.displayRental();
        System.out.println();
        customRental.displayRental();
    }
}
