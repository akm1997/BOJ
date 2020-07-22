package baekjoon;

import java.util.*;

public class BOJ_1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] input = new int[T];
		int cnt = 0;
		int result = T;
		for (int i = 0; i < T; i++) {
			input[i] = sc.nextInt();
			if (input[i] == 1) {
				result--;
				continue;
			} else if (input[i] == 2) {
				continue;
			} else {
				for (int j = 2; j < input[i]; j++) {
					if (input[i] % j == 0) {
						result--;
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}