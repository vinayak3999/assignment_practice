package assignment_practice;

public class Fibonacci {
	public static void main(String[] args) {

		int n = 10, a = 0, b = 1;
		//		int a = 0;
		//		int b = 1;
		System.out.println("Fibonacci series for first " + n + " numbers are: ");
//		int i = 0;

		//		while(i <= n) {
		//			System.out.println(a + ", ");
		//			int c = a + b;
		//			a = b;
		//			b = c;
		//			i++;

		for (int i = 1; i <= n; i++) {
			System.out.println(a + ",");
			int c = a + b;
			a = b;
			b = c;


		}
	}

}

