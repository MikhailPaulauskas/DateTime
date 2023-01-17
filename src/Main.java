import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm MM/dd");
        LocalDateTime now = LocalDateTime.now();
        int koolling  = 23;
        System.out.println(now.format(formatter) + "now");


        



    }
}