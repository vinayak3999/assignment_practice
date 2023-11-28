package assignment_practice;

import java.util.Scanner;

public class TimeFormat {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Seconds");
		int seconds = scan.nextInt();
		
		int S = seconds%60;
		int H = seconds/60;
		int M = H%60;
		
		H = H/60;
		
//		System.out.println(s);
//		System.out.println(H);
//		System.out.println(M);
//		System.out.println(H);
		
		System.out.println(H + ":" + M + ":" + S);
		
		System.out.println("\n");
		
	
	}
		
	
		
	

}
