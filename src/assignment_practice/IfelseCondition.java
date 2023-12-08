package assignment_practice;

import java.util.Scanner;

public class IfelseCondition {
	public static void main(String[] args) {

//		If-else
		
//	int age = 18;
//	if(age < 18) {
//		
//		System.out.println("Child");
//	}else {
//		System.out.println("Adult");
//	}
//		0-18 = Child;
//		18-30= Adult;
//		30-45 = Mature;
//		greater than 45 = Old;
//		Test Data- 0, 17, 18, 19, 29, 30, 31, 44, 45, 46, 60
		
		
		//If-else-If
		
		System.out.println("Welcome to my age group Calculator");
//		while(true) {
//			System.out.println("-----------------------");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please Enter your age: ");
//		int age = scan.nextInt();
//		
////		int age = 55;
//		if(age < 18) {
//			System.out.println("Child");
//		}else if(age >= 18 && age < 30) {
//			System.out.println("Adult");
//		}else if(age >= 30 && age < 45) {
//			System.out.println("Mature");
//		}else {
//			System.out.println("Old");
//		}
//}
		
		while(true) {
			System.out.println("-----------------------");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your age: ");
		int age = scan.nextInt();
		System.out.println("expected Age Group: ");
		String expectedAgeGroup = scan.next();
		String ageGroup = "";
		
		if(age < 18) {
			ageGroup = "Child";
		}else if(age >= 18 && age < 30) {
			ageGroup = "Adult";
		}else if(age >= 30 && age < 45) {
			ageGroup = "Mature";
		}else {
			ageGroup = "Old";
		}
		if(expectedAgeGroup.equals(ageGroup)) {
			System.out.println("Test Passed");
		}else {
			System.err.println("Test Failed. Expected:" + expectedAgeGroup + ", Actual: "+ageGroup );
		}
}
}
}
