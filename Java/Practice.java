public class Practice {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 20;

		for (int x = num1; x < num2; x++) {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println(x);
			}
		}
	}
}
