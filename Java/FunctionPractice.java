public class FunctionPractice {
	static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int reverseNum(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num /= 10;
		}
		return rev;
	}

	static void fibonacci(int num) {
		int first = 0, secend = 1;

		for (int i = 0; i < num; i++) {
			System.out.print(first + " ");

			int next = first + secend;
			first = secend;
			secend = next;
		}
	}

	static double convertTemp(double temp) {
		return (temp * 9 / 5) + 32;
	}

	public static void main(String[] args) {
		// System.out.println(isPrime(17));
		// System.out.println(reverseNum(852));
		// fibonacci(8);
		// double temp = convertTemp(51);
		System.out.println(convertTemp(51));
	}
}

// 234
// 432

// 0, 1, 1, 2, 3, 5, 8, 13

// temp = 35