package assignment_practice;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer number: ");
		int value = scan.nextInt();
		System.out.println("Input: " + value);
		System.out.println("------");
		System.out.println("Output");
		System.out.printf("Square: %.0f%n", Math.pow(value, 2));
		System.out.printf("cube: %.0f%n", Math.pow(value, 3));
		System.out.printf("fourth power: %.0f%n", Math.pow(value, 4));
	}

}
