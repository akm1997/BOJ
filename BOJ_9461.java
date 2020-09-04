package baekjoon;

import java.util.*;

public class BOJ_9461 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] P = new long[101];
		int T = sc.nextInt();
		int[] input = new int[T];
		P[1] = 1;
		P[2] = 1;
		P[3] = 1;
		P[4] = 2;
		P[5] = 2;
		for (int i = 6; i <= 100; i++) {
			P[i] = P[i - 3] + P[i - 2];
		}
		for (int i = 0; i < T; i++) {
			input[i] = sc.nextInt();
		}
		for (int i = 0; i < T; i++) {
			System.out.println(P[input[i]]);
		}
	}
}
