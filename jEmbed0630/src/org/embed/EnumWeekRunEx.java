package org.embed;

import java.util.Calendar;
import java.util.Date;

public class EnumWeekRunEx {

	public static void main(String[] args) {
		
		Week today = null;
		
//		Date date = new Date(2025, 6, 30);
		
		Calendar cal = Calendar.getInstance();		//GreogorianCalendar (1970-01-01 00:00:00)
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		

		
		System.out.println(today);
		

	}

}
