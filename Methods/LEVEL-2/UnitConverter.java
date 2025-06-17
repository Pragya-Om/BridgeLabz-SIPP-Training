public class UnitConverter {
    // Conversion methods
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    // Main method to test conversions
    public static void main(String[] args) {
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers = " + miles + " miles");

        double f = 98.6;
        double c = convertFahrenheitToCelsius(f);
        System.out.println(f + " Fahrenheit = " + c + " Celsius");

        double meters = 1;
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meter = " + inches + " inches");

        double pounds = 150;
        double kg = convertPoundsToKg(pounds);
        System.out.println(pounds + " pounds = " + kg + " kg");
    }
}
