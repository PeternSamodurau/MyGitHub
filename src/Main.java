import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(formatter.format(new Date()));
        LocalDate localDate = LocalDate.now();

    }
}
