

public class DateActivity {
	int year,month,day,num;
	String dateConvert;
	 public void setYear(int year)
	    {
	        this.year = year;
	    }

	    public int getYear()
	    {
	        return year;
	    }
	    public void setMonth(int month)
	    {
	        this.month = month;
	    }

	    public int getMonth()
	    {
	        return month;
	    }   
	    public void setDay(int day)
	    {
	        this.day = day;
	    }

	    public int getDay()
	    {
	        return day;
	    }   
	/*public DateActivity(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		
		
	}*/
	public String dateConvert(int num ){
		if (num ==1 ){
			dateConvert="Sunday";
		}
		else if (num ==2) {
			dateConvert="Monday";
		}
		else if (num ==3) {
			dateConvert="Tuesday";
		}
		else if (num ==4) {
			dateConvert="Wednesday";
		}
		else if (num ==5) {
			dateConvert="Thursday";
		}
		else if (num ==6) {
			dateConvert="Friday";
		}
		else {
			dateConvert="Saturday";
		}
			
		return dateConvert;
	}
	
}