package lab3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDuration {
	
	private static void difference(String startDate, String endDate) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		Date start = formatter.parse(startDate);
		Date end = formatter.parse(endDate);
		long diffInMilliSeconds = end.getTime() - start.getTime();
		long diffInDays = (diffInMilliSeconds /  (1000 * 60 * 60 * 24)) % 365;
//		long diffInMonths = (diffInMilliSeconds/(1000*60*60*24*30)) % 12 ;
		long diffInYears = (diffInMilliSeconds/(1000 * 60 * 60 * 24 * 365));
		System.out.println("The differnce between two dates is " + diffInDays + " Days."  + diffInYears);
	}

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter date in the format DD/MM/YYYY");
		String input = sn.next();
		Date todayDate = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		String today = formatter.format(todayDate);
		try {
			difference(input,today);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sn.close();
	}



}
