package myjavaproject;
import java.util.*;
public class calender {
	public static void main(String args[]) {
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		System.out.println(d);
		c.set(2024,c.OCTOBER,13);
		int year=c.getWeekYear();
		System.out.println(year);
		int h=c.getFirstDayOfWeek();
		System.out.println(h);
		int r=c.getWeeksInWeekYear();
		System.out.println(r);
		
		
	}

}
