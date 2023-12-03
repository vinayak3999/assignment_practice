package assignment_practice;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the 1st number");
		int i = scan.nextInt();
		
		System.out.println("Input the 2nd number");
		int j = scan.nextInt();
	
		System.out.println("Input the 3rd number");
		int k = scan.nextInt();
		
		if(i > j)
			if(i > k) 
				System.out.println("The greatest: " + i);
		
		if(j > i)
			if(j > k)
				System.out.println("The greatest: " + j);
		
		if(k > i)
			if(k > j)
				System.out.println("The greatest: " + k);
			
		
		
		
}
}