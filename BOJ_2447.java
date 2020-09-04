package baekjoon;

import java.util.*;

public class BOJ_2447 {
	int N;
	char[][] chess;

	public static void main(String[] args) {
		BOJ_2447 B = new BOJ_2447();
		B.start();
	}

	public void start()  {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		chess = new char[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				chess[i][j] = ' ';
			}
		}
		Recursion(0, 0, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(chess[i][j]);
			}
			System.out.println();
		}
	}

	void Recursion(int x, int y, int N) {
		if (N == 1) {
			chess[x][y] = '*';
			return;
		}
		int size = N / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 && j == 1)
					continue;
				Recursion(x + (size * i), y + (size * j), size);
			}
		}
	}

}
