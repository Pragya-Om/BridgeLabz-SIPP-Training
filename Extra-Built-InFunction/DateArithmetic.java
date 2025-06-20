import java.time.LocalDate;

public class DateArithmetic {

    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 6, 20); 

        LocalDate updatedDate = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Original date: " + inputDate);
        System.out.println("Updated date: " + updatedDate);
    }
}
