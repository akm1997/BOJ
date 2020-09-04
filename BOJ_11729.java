package baekjoon;

import java.util.*;

public class BOJ_11729 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println((int) Math.pow(2, N) - 1);
		hanoi(N, 1, 2, 3);
		System.out.println(sb.toString());
	}

	static StringBuilder sb = new StringBuilder();

	static void hanoi(int n, int start, int mid, int end) {
		if (n == 1) {
			sb.append(start).append(" ").append(end).append("\n");
		} else {
			hanoi(n - 1, start, end, mid);
			sb.append(start).append(" ").append(end).append("\n");
			hanoi(n - 1, mid, start, end);
		}
	}
}
