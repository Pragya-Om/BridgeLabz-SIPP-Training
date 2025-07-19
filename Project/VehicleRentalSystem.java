package Project;


public class VehicleRentalSystem {

    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "9876543210");

        Vehicle car = new Car("BMW X5", "MH01AB1234", 1000, true);
        Vehicle bike = new Bike("Yamaha FZ", "MH01XY9876", 300);
        Vehicle truck = new Truck("Tata Heavy", "MH02TR5555", 1500, 6000);

        int rentalDays = 5;

        System.out.println("Customer: " + customer.getName());
        System.out.println("Car Rent: ₹" + car.calculateRent(rentalDays));
        System.out.println("Bike Rent: ₹" + bike.calculateRent(rentalDays));
        System.out.println("Truck Rent: ₹" + truck.calculateRent(rentalDays));
    }

    
    interface Rentable {
        double calculateRent(int days);
    }

   
    abstract static class Vehicle implements Rentable {
        protected String model;
        protected String licensePlate;
        protected double baseRate;

        public Vehicle(String model, String licensePlate, double baseRate) {
            this.model = model;
            this.licensePlate = licensePlate;
            this.baseRate = baseRate;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getLicensePlate() {
            return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
        }

        public double getBaseRate() {
            return baseRate;
        }

        public void setBaseRate(double baseRate) {
            this.baseRate = baseRate;
        }
    }

   
    static class Car extends Vehicle {
        private boolean luxury;

        public Car(String model, String licensePlate, double baseRate, boolean luxury) {
            super(model, licensePlate, baseRate);
            this.luxury = luxury;
        }

        @Override
        public double calculateRent(int days) {
            double surcharge = luxury ? 200.0 : 0.0;
            return (baseRate * days) + surcharge;
        }

        public boolean isLuxury() {
            return luxury;
        }

        public void setLuxury(boolean luxury) {
            this.luxury = luxury;
        }
    }

    static class Bike extends Vehicle {
        public Bike(String model, String licensePlate, double baseRate) {
            super(model, licensePlate, baseRate);
        }

        @Override
        public double calculateRent(int days) {
            return baseRate * days - (days > 3 ? 10 : 0);
        }
    }

   
    static class Truck extends Vehicle {
        private double loadCapacity;

        public Truck(String model, String licensePlate, double baseRate, double loadCapacity) {
            super(model, licensePlate, baseRate);
            this.loadCapacity = loadCapacity;
        }

        @Override
        public double calculateRent(int days) {
            double surcharge = loadCapacity > 5000 ? 300 : 150;
            return (baseRate * days) + surcharge;
        }

        public double getLoadCapacity() {
            return loadCapacity;
        }

        public void setLoadCapacity(double loadCapacity) {
            this.loadCapacity = loadCapacity;
        }
    }

    static class Customer {
        private String name;
        private String contact;

        public Customer(String name, String contact) {
            this.name = name;
            this.contact = contact;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }
    }
}

