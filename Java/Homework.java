public class Homework {
	static void countDigit(int num) {
		int even = 0, odd = 0, total = 0;

		while (num != 0) {
			int r = num % 10;
			num = num / 10;
			total++;
			if (r % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even Count: " + even);
		System.out.println("Odd Count: " + odd);
		System.out.println("Total Count: " + total);
	}

	static void GCDLCM(int num1, int num2) {
		int gcd = 1;

		for (int i = 1; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		int lcm = (num1 * num2) / gcd;

		System.out.println("GCD: " + gcd);
		System.out.println("LCM: " + lcm);
	}

	public static void main(String[] args) {
		// countDigit(895461);
		GCDLCM(24, 36);
	}
}
