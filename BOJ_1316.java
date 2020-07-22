package baekjoon;

import java.util.*;

public class BOJ_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = num;
		String[] input = new String[num];
		for (int i = 0; i < num; i++) {
			input[i] = sc.next();
		}
		for (int i = 0; i < num; i++) {
			boolean[] checker = new boolean[26];
			for (int j = 1; j < input[i].length(); j++) {
				if (input[i].charAt(j) != input[i].charAt(j - 1)) {//알파벳이 달라진다면
					if (checker[input[i].charAt(j) - 97] == true) {//이전에 있었던 알파벳인지 확인
						result--;
						break;
					}
				}
				checker[input[i].charAt(j - 1) - 97] = true;
			}
		}
		System.out.println(result);
	}
}
