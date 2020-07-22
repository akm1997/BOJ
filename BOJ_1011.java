package baekjoon;

import java.util.Scanner;
import java.util.*;

public class BOJ_1011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] x = new long[T];
		long[] y = new long[T];
		long[] min = new long[T];
		long key = 0;

		for (int i = 0; i < T; i++) {
			x[i] = sc.nextLong();
			y[i] = sc.nextInt();
			for (long j = 1; j * j <= y[i] - x[i]; j++) {
				key = j;
			}
			if (y[i] - x[i] == key * key) {
				min[i] = 2 * key - 1;
			} else if (y[i] - x[i] > key * key
					&& y[i] - x[i] < (key + 1) * (key + 1)) {
				if (y[i] - x[i] > key * key && key * key + key >= y[i] - x[i]) {
					min[i] = 2 * key;
				} else {
					min[i] = 2 * key + 1;
				}

			}

		}
		for (int i = 0; i < T; i++) {
			System.out.println(min[i]);
		}

	}
}
