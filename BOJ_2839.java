package baekjoon;

import java.util.*;

public class BOJ_2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input % 5 == 0) {
			System.out.println(input / 5);
		} else if (input % 5 != 0) {
			for (int i = input / 5; i >= 0; i--) {
				for (int j = 0; j <= input / 3; j++) {
					if (input == i * 5 + j * 3) {
						System.out.println(i + j);
						return;
					} else if (i == 0 && j == input / 3) {
						System.out.println(-1);
					}
				}
			}
		}
	}
}
