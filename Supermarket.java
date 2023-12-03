import java.text.SimpleDateFormat;
import java.util.Date;

public class Supermarket {
    private String name;
    private Date currentDate;

    public Supermarket(String name) {
        this.name = name;
        this.currentDate = new Date();
    }

    public String getName() {
        return name;
    }

    public String getFormattedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd/MM/yyyy");
        return dateFormat.format(currentDate);
    }

    public String getFormattedTime() {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss z");
        return timeFormat.format(currentDate);
    }
}
