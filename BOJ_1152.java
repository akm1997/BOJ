package baekjoon;

import java.util.*;

public class BOJ_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if (input.equals("") || input.equals(" ")) {
			System.out.println(0);
		} else {
			input = input.trim();
			String result[] = input.split(" ");
			System.out.println(result.length);
		}
	}
}
