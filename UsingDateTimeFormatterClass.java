import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsingDateTimeFormatterClass {
    public static void main(String[] args) {

		LocalDate today = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(today.format(formatter));
        System.out.println(time.format(formatter2));

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("hh  : " +
            now.format(DateTimeFormatter.ofPattern("hh")));

        System.out.println("mm  : " +
            now.format(DateTimeFormatter.ofPattern("mm")));

        System.out.println("ss  : " +
            now.format(DateTimeFormatter.ofPattern("ss")));

        System.out.println("a   : " +
            now.format(DateTimeFormatter.ofPattern("a")));
    }
}
