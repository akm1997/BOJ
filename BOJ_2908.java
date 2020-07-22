package baekjoon;

import java.util.*;

public class BOJ_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input1 = sc.next();
		String input2 = sc.next();
		int result1;
		int result2;
		StringBuilder str1 = new StringBuilder(input1);
		StringBuilder str2 = new StringBuilder(input2);
		str1 = str1.reverse();
		str2 = str2.reverse();
		input1 = str1.toString();
		input2 = str2.toString();
		result1 = Integer.parseInt(input1);
		result2 = Integer.parseInt(input2);
		if (result1 > result2) {
			System.out.println(result1);

		} else
			System.out.println(result2);

	}
}
