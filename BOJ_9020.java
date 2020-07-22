package baekjoon;

import java.util.*;

public class BOJ_9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] input = new int[T];
		for (int i = 0; i < T; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < T; i++) {
			int a = input[i] / 2;
			int b = input[i] / 2;
			while (true) {
				if (isPrime(a) && isPrime(b)) {
					break;
				} else {
					a--;
					b++;
				}
			}
			System.out.println(a + " " + b);

		}
	}

	public static boolean isPrime(int number) {
		int i = 2;
		while (true) {
			if (i * i <= number) {
				if (number % i == 0) {
					return false;
				} else
					i++;
			} else {
				return true;
			}
		}

	}
}
