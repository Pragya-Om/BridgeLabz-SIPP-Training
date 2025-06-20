import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZonesExample {

    public static void main(String[] args) {
        displayTimeInZone("GMT");
        displayTimeInZone("Asia/Kolkata");  
        displayTimeInZone("America/Los_Angeles");  
    }

    public static void displayTimeInZone(String zone) {
        ZonedDateTime time = ZonedDateTime.now(ZoneId.of(zone));
        System.out.println("Current time in " + zone + ": " + time.format(DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z")));
    }
}
