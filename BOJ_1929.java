package baekjoon;

import java.util.*;

public class BOJ_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean[] isPrime = new boolean[N + 1];
		isPrime[0] = isPrime[1] = true;
		for (int i = 2; i * i <= N; i++) {
			if (isPrime[i] == false) {
				for (int j = i * i; j <= N; j += i) {
					isPrime[j] = true;
				}
			}
		}
		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i] == false) {
				if (i >= M) {
					System.out.println(i);
				}
			}
		}
	}
}
