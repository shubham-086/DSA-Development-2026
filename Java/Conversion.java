public class Conversion {
	public static void main(String[] args) {
		// short a = 2000;
		// int b = a; // Implicit Conversion
		// byte c = (byte) a; // Explicit | Lossy Conversion
		// float d = 1.5f;
		// int e = (int) d;

		int a = 200;
		short b = 5;
		byte c = 2;
		char ch = 'a';

		byte res = (byte) (a + b + c + ch);

		System.out.println(res);
	}
}
