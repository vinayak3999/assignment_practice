package assignment_practice;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer number: ");
		double value = scan.nextDouble();
		System.out.println("Input: " + (double)value);
		System.out.println("------");
		System.out.println("Output");
		System.out.printf("Square: %.2f%n", Math.pow((double)value, 2));
		System.out.printf("cube: %.2f%n", Math.pow((double)value, 3));
		System.out.printf("fourth power: %.2f%n", Math.pow((double)value, 4));
	}

}
