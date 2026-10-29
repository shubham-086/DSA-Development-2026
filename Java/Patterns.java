public class Patterns {
	public static void main(String[] args) {
		int num = 5;

		for (int i = 0; i < num; i++) {
			for (int s = 0; s < num - i - 1; s++) {
				System.out.print("  ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
