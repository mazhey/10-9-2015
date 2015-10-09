import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
public class DateChangeActivity {
	public static void main(String[] args) {
		Date now = new Date();
		DateFormat formatter = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
	    System.out.println(formatter.format(now));
	    formatter = DateFormat.getTimeInstance();        // time only
	    System.out.println(formatter.format(now));
	    
        
	}

}
