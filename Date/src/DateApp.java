import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateApp {

	public static void main(String[] args) {
		int yyyy,mm,dd,YYYY,MM,DD;
		Date now = new Date();
		String date, formatNow, answer;
		//Calendar cal = Calendar.getInstance();  

		Scanner keyboard = new Scanner(System.in);
		do
		{	
		System.out.print( "What is the date that you are asking about? dd/mm/yyyy format. " );
		date= keyboard.next();
		
		String tokens[] = date.split("/");
	
		yyyy = (int)Integer.parseInt(tokens[2]);
		mm = (int)Integer.parseInt(tokens[1]);
		dd = (int)Integer.parseInt(tokens[0]); 
		//System.out.print(now);
		//DateFormat   formatter = DateFormat.getDateInstance(DateFormat.SHORT,  Locale.US);
		//System.out.println(formatter.format(now));
		//SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		//Date date = (Date)formatter.parse("5/1/12");

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		formatNow = (String)formatter.format(now);
		//System.out.print(formatNow);
		//String tokens1[] = formatNow.split("/");
		//YYYY = (int)Integer.parseInt(tokens1[2]);
		//MM = (int)Integer.parseInt(tokens1[1]);
		//DD = (int)Integer.parseInt(tokens1[0]); 
		Calendar cal2 = new GregorianCalendar(yyyy,mm, dd);
		cal2.get(Calendar.DAY_OF_WEEK); 
		System.out.print("\n");
		//System.out.print(cal2.get(Calendar.DAY_OF_WEEK));
		DateActivity myDateActivity = new DateActivity();
		//myDateActivity.dateConvert(cal2.get(Calendar.DAY_OF_WEEK));
		System.out.print(myDateActivity.dateConvert(cal2.get(Calendar.DAY_OF_WEEK)));
	
		long estimatedTime = System.currentTimeMillis() - cal2.getTimeInMillis();
		long millisecondsPerDay = (24*60*60*1000);
		 float numberOfDays =estimatedTime /millisecondsPerDay;
	
		System.out.print("\n");
		//System.out.print(days);
		System.out.print("That was a " + myDateActivity.dateConvert(cal2.get(Calendar.DAY_OF_WEEK)) +". It was " + numberOfDays+ " days ago.");
		System.out.print("\n");
		System.out.print("keep asking? Y/N");
		answer=keyboard.next();
		}while(answer.equals("Y"));
		
		keyboard.close();
	}
	
}
	
		