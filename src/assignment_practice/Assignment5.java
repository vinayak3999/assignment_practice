package assignment_practice;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number between 1 to 7");
		int day = scan.nextInt();
		
		if(day < 1) {
			System.out.println("Sunday");
			
		}else {
			
			System.out.println("Monday");
		}
		
	}

}
