package baekjoon;

import java.util.*;

public class BOJ_15650 {
	int m, n;
	int[] list;
	int[] check;

	public static void main(String[] args) {
		BOJ_15650 b = new BOJ_15650();
		b.start();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		list = new int[9];
		check = new int[9];
		dfs(0);
	}

	void dfs(int cnt) {
		if (cnt == m) {
			for (int i = 0; i < m; i++) {
				System.out.print(list[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (check[i] == 1)
				continue;
			if (cnt > 0) {
				if (list[cnt - 1] > i)
					continue;
			}
			check[i] = 1;
			list[cnt] = i;
			dfs(cnt + 1);
			check[i] = 0;

		}
	}
}
