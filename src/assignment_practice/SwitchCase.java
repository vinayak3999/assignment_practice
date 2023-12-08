package assignment_practice;

public class SwitchCase {
	public static void main(String[] args) {

		String dayName = "Wed";
		int dayNumber = 0;

		if (dayName.equals("Monday") || dayName.equals("Mon")) {
			dayNumber = 1;
		} else if (dayName.equals("Tuesday") || dayName.equals("Tue")) {
			dayNumber = 2;
		} else if (dayName.equals("Wedensday") || dayName.equals("Wed")) {
			dayNumber = 3;

		} else if (dayName.equals("Thursday") || dayName.equals("Thu")) {
			dayNumber = 4;

		} else if (dayName.equals("Friday") || dayName.equals("Fri")) {
			dayNumber = 5;
		} else if (dayName.equals("Saturday") || dayName.equals("Sat")) {
			dayNumber = 6;
		} else if (dayName.equals("Sunday") || dayName.equals("Sun")) {
			dayNumber = 7;
		}
		System.out.println(dayName + " - " + dayNumber);
		
//		Switch Case only compare Equality
		
		switch (dayName) {
		case "Monday":
		case "Mon":
			dayNumber = 1;
			break;
		case "Tuesday":
		case "Tue":
			dayNumber = 2;
			break;
		case "Wednesday":
		case "Wed":
			dayNumber = 3;
			break;
		case "Thursday":
		case "Thu":
			dayNumber = 4;
			break;
		case "Friday":
		case "Fri":
			dayNumber = 5;
			break;
		case "Saturday":
		case "Sat":
			dayNumber = 6;
			break;
		case "Sunday":
		case "Sun":
			dayNumber = 7;
			break;
			
		default:
			break;
		}
		System.out.println(dayName + " - " + dayNumber);
		
	}
}
