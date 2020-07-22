package baekjoon;

import java.util.*;

public class BOJ_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next().toUpperCase();
		int[] ch = new int[26];
		int max = 0;
		char result = 'a';
		for (int i = 0; i < input.length(); i++) {
			ch[input.charAt(i) - 65]++;
			if (max < ch[input.charAt(i) - 65]) {
				max = ch[input.charAt(i) - 65];
				result = input.charAt(i);
			} else if (max == ch[input.charAt(i) - 65])
				result = '?';
		}
		System.out.println(result);

	}
}
