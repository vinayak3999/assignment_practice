package assignment_practice;

import java.util.Scanner;

public class TemperatureScale {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        double temp = scan.nextDouble();
        double F = temp + 32;
        System.out.println("<-----------> ");
        System.out.println("Output: ");
        System.out.println(temp +  " celsius "  + " = " +  F +  " Fahrenheit");
        double K = temp + 273;
        System.out.println(temp +  " celsius " +  " = " +  K +  " Kelvin");
        
        
		
	}

	
	
}
