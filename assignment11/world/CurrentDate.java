package world;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentDate {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd//MM//yyyy");
        System.out.println(d1);
    }
}
