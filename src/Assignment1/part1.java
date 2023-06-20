package Assignment1;

public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int random = (int) (Math.random() * 12 + 1);
		System.out.println(random);

		String monthName;

		switch (random) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "Febuary";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "an invalid month";
			break;
		}
		System.out.println("Your month is " + monthName);
	}
}
