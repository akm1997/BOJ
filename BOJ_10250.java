package baekjoon;

import java.util.*;

public class BOJ_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] H = new int[T];
		int[] W = new int[T];
		int[] N = new int[T];
		int[] result = new int[T];
		for (int i = 0; i < T; i++) {
			H[i] = sc.nextInt();
			W[i] = sc.nextInt();
			N[i] = sc.nextInt();
			if (N[i] % H[i] != 0) {
				result[i] = (N[i] % H[i]) * 100 + N[i] / H[i] + 1;
			} else {
				result[i] = H[i] * 100 + N[i] / H[i];
			}
		}
		for (int i = 0; i < T; i++) {
			System.out.println(result[i]);
		}
	}
}
