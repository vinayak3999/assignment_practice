package assignment_practice;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input 1st Integer ");
		int i = scan.nextInt();
		
		System.out.println("Input 2nd Integer");
		int j = scan.nextInt();
		
		System.out.println("Input: " + i + " and " + j);
		System.out.println("----------");
		System.out.println("Output: ");
		
		System.out.printf("Sum: %d%n",  i + j);
		System.out.printf("Difference: %d%n",  i - j);
		System.out.printf("Product: %d%n",  i * j);
		System.out.printf("Average: %.2f%n",  (double)(i + j)/2);
		System.out.printf("Distance: %d%n",  Math.abs(i - j));
		System.out.printf("Max: %d%n", Math.max(i, j));
		System.out.printf("Min: %d%n", Math.min(i, j));
	}
	

}
