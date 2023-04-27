import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time); 
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter  d = DateTimeFormatter.ofPattern("DD-MM-YYYY");
        System.out.println(d);
    }  
}
