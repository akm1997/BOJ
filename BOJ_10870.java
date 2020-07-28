package baekjoon;

import java.util.*;

public class BOJ_10870 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] result = new int[input + 1];
		for (int i = 0; i <= input; i++) {
			if (i < 2) {
				result[i] = i;
			} else
				result[i] = result[i - 2] + result[i - 1];
		}
		System.out.println(result[input]);

	}
}
