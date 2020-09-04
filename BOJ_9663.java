package baekjoon;

import java.util.*;

public class BOJ_9663 {
	static int N;
	static int[] row;
	static int cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		cnt = 0;
		for (int i = 1; i <= N; i++) {
			row = new int[N + 1];
			row[1] = i;    //첫 행 i열에서 체스 배치
			dfs(1);
		}

		System.out.println(cnt);

	}

	static void dfs(int n) {
		if (n == N) {       //N행까지 같을경우 재귀 탐색 종료
			cnt++;

		} else {
			for (int i = 1; i <= N; i++) {
				row[n+1] = i;
				if (possible(n+1)) {
					dfs(n + 1);
				}

			}

		}
	}

	static boolean possible(int k) {   //체스 배치 가능 여부 메소드
		for (int i = 1; i < k; i++) {
			if (row[i] == row[k]) {     //열이 같을 때
				return false;
			} else if (Math.abs(row[i] - row[k]) == Math.abs(i - k)) { //대각선일때   
				return false;
			}
		}
		return true;
	}
}
