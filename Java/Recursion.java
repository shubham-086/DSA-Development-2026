public class Recursion {
	static void printN(int x) {
		if (x == 0) {
			return;
		}
		printN(x - 1);
		System.out.println(x);
	}

	static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		printN(5);
	}
}
