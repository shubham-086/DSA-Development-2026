public class FunctionExample {
	static void greet(String name, String msg) {
		System.out.println("Welcome " + name);
		System.out.println(msg);
	}

	static void oddEven(int num) {
		if (num % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int rangeSum(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum;
	}

	static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static int digitSum(int num) {
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			num = num / 10;
			sum += r;
		}
		return sum;
	}

	public static void main(String[] args) {
		// greet("Rahul", "How are you?");

		// int res = sum(10, 20);
		// System.out.println(res);

		// System.out.println(rangeSum(5, 10));
		// System.out.println(fact(6));
		System.out.println(digitSum(2342));
	}
}
