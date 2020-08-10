package baekjoon;

import java.util.*;

public class BOJ_7568 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] p = new int[N][2];
		int[] rank = new int[N];
		for (int i = 0; i < N; i++) {
			rank[i] = 1;
			for (int j = 0; j < 2; j++) {
				p[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (j != i) {
					if (p[i][0] > p[j][0] && p[i][1] > p[j][1]) {
						rank[j]++;
					}
				}
			}

		}
		for (int i = 0; i < N; i++) {
			System.out.print(rank[i] + " ");
		}

	}
}
