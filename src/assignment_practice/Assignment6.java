package assignment_practice;

import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Month");
		
		int month = scan.nextInt();
		int days = 0;
		
		switch (month) {
		case 1:
			days = 31;
			break;
		case 2:
			days = 28;
			break;
		case 3:
			days = 30;
			break;
		case 4:
			days = 31;
			break;
		case 5:
			days = 30;
			break;
		case 6:
			days = 31;
			break;
		case 7:
			days = 30;
			break;
		case 8:
			days = 31;
			break;
		case 9:
			days = 30;
			break;
		case 10:
			days = 31;
			break;
		case 11:
			days = 30;
			break;
		case 12:
			days = 31;
			break;
			
		default:
			break;
		}
		
		System.out.println("Month number is " + month + " and the days in months are "+days);
		
		}
		

	}
	
