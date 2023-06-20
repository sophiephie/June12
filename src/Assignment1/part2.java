package Assignment1;

import java.util.Scanner;

public class part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a month then a year");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int year = sc.nextInt();
		
		String monthName;
		int date;
		
		switch (month) {
		case 1:
			monthName = "Jan";
			date = 31;
			break;
		case 2:
			monthName = "Feb";
			if (year %4 == 0) {
				date = 29;
				} else  {
					date = 28;
				}
			break;
		case 3:
			monthName = "March";
			date = 31;
			break;
		case 4:
			monthName = "April";
			date = 30;
			break;
		case 5:
			monthName = "May";
			date = 31;
			break;
		case 6:
			monthName = "June";
			date = 30;
			break;
		case 7:
			monthName = "July";
			date = 31;
			break;
		case 8:
			monthName = "August";
			date = 31;
			break;
		case 9:
			monthName = "September";
			date = 30;
			break;
		case 10:
			monthName = "October";
			date = 31;
			break;
		case 11:
			monthName = "November";
			date = 30;
			break;
		case 12:
			monthName = "December";
			date = 31;
			break;
		default:
			monthName = "an invalid month";
			date = 0;
			break;
		}
		
	
	System.out.println(monthName + " in " + year + " has " + date + " days ");
	sc.close();
}
}