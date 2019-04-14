/*
 * Manny Peterson's Solution to Project Euler Problem #2
 * https://projecteuler.net/problem=2
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	public static int a = 0;
	public static int b = 1;

	public static boolean isEven(int n) {
		if (n < 1)
			return false;
		if (n >= 2 && (n & 1) == 0)
			return true;
		return false;
	}

	public static int nextFib() {
		int c = 0;
		c = a + b;
		a = b;
		b = c;
		return c;
	}

	public static void main(String[] args) {
		int n = 0, s = 0;
		do {
			n = Main.nextFib();
			if (Main.isEven(n))
				s += n;
		} while (n <= 4000000);
		System.out.format("ANSWER = %d\n", s);
	}
}
