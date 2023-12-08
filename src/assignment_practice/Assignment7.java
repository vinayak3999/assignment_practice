package assignment_practice;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Weekday Number");

		int dayNumber = scan.nextInt();
		String dayName = "";

		switch (dayNumber) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wedensday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;

		default:
			dayName = "Invalid Day range";
			break;
		}
		System.out.println(dayNumber + " - "+ dayName);

	}

}
