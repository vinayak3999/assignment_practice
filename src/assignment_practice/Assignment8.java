package assignment_practice;

public class Assignment8 {
	public static void main(String[] args) {
		System.out.print("Divided by 3: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0)
				System.out.print(i + ",");
		}

		System.out.print("\n\nDivided by 5: ");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0)
				System.out.print(i + ",");
		}

		System.out.print("\n\nDivided by 3 & 5: ");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(i + ",");
		}

		System.out.println("\n");
	}
}
