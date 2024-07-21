package world;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class PrintTime {
    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(f.format(t));
    }
}
