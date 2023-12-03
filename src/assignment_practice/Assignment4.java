package assignment_practice;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inpuet the number");
		int i = scan.nextInt();
		
		if(i < 0) {
			System.out.println("Number is Negative");
		}else if(i > 0) {
			System.out.println("Number is Positive");
		}else {
			System.out.println("Number is zero");
		}
	}

}
