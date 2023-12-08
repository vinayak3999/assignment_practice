package assignment_practice;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of N: ");
		int N = scan.nextInt();
		int x = 2;

		System.out.print("Prime numbers up to " + N + ": ");

		for (int i = 0; i < N; i++) {
			int count = 0;

			for (int j = 1; j <= x; j++) {
				if (x % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print(x + " ");
			}

			x++;
		}

		scan.close();



	}
}



