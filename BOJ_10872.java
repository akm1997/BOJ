package baekjoon;

import java.util.*;

public class BOJ_10872 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= input; i++) {
			result = result * i;
		}
		System.out.println(result);
	}
}
