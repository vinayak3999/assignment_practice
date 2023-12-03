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
		
		
		//If-else-If
		
		System.out.println("Welcome to my age group Calculator");
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your age: ");
		int age = scan.nextInt();
		
//		int age = 55;
		if(age < 18) {
			System.out.println("Child");
		}else if(age >= 18 && age < 30) {
			System.out.println("Adult");
		}else if(age >= 30 && age < 45) {
			System.out.println("Mature");
		}else {
			System.out.println("Old");
		}
}
}
}
