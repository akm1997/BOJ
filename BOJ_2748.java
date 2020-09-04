package baekjoon;

import java.util.*;

public class BOJ_2748 {
	static long[] memo;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		memo = new long[n + 1];
		System.out.println(fibonacci(n));
	}

	static long fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			if (memo[n] != 0) {
				return memo[n];
			}
			memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
			return memo[n];
		}

	}
}
