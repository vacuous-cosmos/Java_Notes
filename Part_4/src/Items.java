import java.util.Calendar;
import java.util.Date;

public class Items {
    String name;
    Date created;
    public Items(String name){
        this.name=name;
        Calendar cal = Calendar.getInstance();
        created=cal.getTime();
    }
}
