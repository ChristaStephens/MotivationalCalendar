package CalendarApp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		// Goal is to create a motivational quote app
		// with each day/quote refreshing and potentially
		// giving a new background & quote.

		// String day = new SimpleDateFormat("EEEE").format(new Date());
		System.out.println(thisIsToday());

		// String timeStamp = new SimpleDateFormat("MM/dd/YYYY hh:mm
		// a").format(Calendar.getInstance().getTime());
		System.out.println(dayWithTime());

	}

	protected static String thisIsToday() {
		String day = new SimpleDateFormat("EEEE").format(new Date());

		return day;

	}

	protected static String dayWithTime() {
		String timeStamp = new SimpleDateFormat("MM/dd/YYYY hh:mm a").format(Calendar.getInstance().getTime());
		return timeStamp;
	}

}
