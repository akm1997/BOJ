package baekjoon;

import java.util.*;

public class BOJ_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<Integer>();
		int input = sc.nextInt();
		int i = 666;
		int cnt = 0;
		while (cnt <= 10000) {
			if (Integer.toString(i).contains("666")) {
				cnt++;
				order.add(i);
			}
			i++;
		}
		System.out.println(order.get(input - 1));
	}
}
