public class Control {
	public static void main(String[] args) {
		for (int num = 10; num < 50; num++) {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println(num);
			}
		}

	}
}

// 80+ = A
// 60 - 80 = B
// 40 - 60 = C
// below 40 = D