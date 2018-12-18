package CalendarApp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class App {

	public static void main(String[] args) {
//		Goal is to create a motivational quote app
//		with each day/quote refreshing and potentially
//		giving a new background & quote.


//		Scanner scnr = new Scanner (System.in);
//		String date;
//		System.out.println("Please enter a date");
//		date = scnr.nextLine();
//		
		// instead of having it in private it, use it in a regular string
		//swich around the formatof timestamp to read ddmmyyhhmmss
		//can create in their own methods to return at top to say (day and time)
		
		
		String day = new SimpleDateFormat("EEEE").format(new Date());
		System.out.println(day);
	
		String timeStamp = new SimpleDateFormat("MM/dd/YYYY hh:mm a").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		
		
	}
	protected String thisistoday() {
		// TODO Auto-generated method stub
		String day = new SimpleDateFormat("EEEE").format(new Date());
		System.out.println(day);
		return  day;
		
	}
	

}
