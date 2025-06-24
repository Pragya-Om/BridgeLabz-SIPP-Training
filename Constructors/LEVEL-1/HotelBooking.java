class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    
    HotelBooking() {
        guestName = "Not Assigned";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

   
    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    void displayBooking() {
        System.out.println("Guest: " + guestName + ", Room Type: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        defaultBooking.displayBooking();
        customBooking.displayBooking();
        copiedBooking.displayBooking();
    }
}
