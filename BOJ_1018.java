package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_1018 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int num1 = 0;
		int num2 = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		char[][] sampleW = new char[8][8];
		char[][] sampleB = new char[8][8];
		char[][] chess = new char[N][M];
		String[] input = new String[N];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++)
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						sampleW[i][j] = 'W';
						sampleB[i][j] = 'B';
					} else {
						sampleW[i][j] = 'B';
						sampleB[i][j] = 'W';
					}
				} else {
					if (i % 2 != 0) {
						if (j % 2 == 0) {
							sampleW[i][j] = 'B';
							sampleB[i][j] = 'W';
						} else {
							sampleW[i][j] = 'W';
							sampleB[i][j] = 'B';
						}

					}
				}
		}
		for (int i = 0; i < N; i++) {
			input[i] = sc.next();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				chess[i][j] = input[i].charAt(j);
			}
		}

		for (int i = 0; i < N - 8 + 1; i++) {
			for (int j = 0; j < M - 8 + 1; j++) {
				for (int h = 0; h < 8; h++) {
					for (int k = 0; k < 8; k++) {
						if (chess[i + h][j + k] != sampleW[h][k]) {
							num1 += 1;
						}
						if (chess[i + h][j + k] != sampleB[h][k]) {
							num2 += 1;

						}
					}
				}
				list.add(num1);
				list.add(num2);
				num1 = 0;
				num2 = 0;
			}
		}

		Collections.sort(list);
		System.out.println(list.get(0));

	}
}
