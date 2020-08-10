package baekjoon;

import java.util.*;

public class BOJ_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> order = new ArrayList<Integer>();
		String num = sc.next();
		for (int i = 0; i < num.length(); i++) {
			order.add(num.charAt(i)-'0');
		}
		Collections.sort(order);
		Collections.reverse(order);
		for (int i = 0; i < order.size(); i++) {
			System.out.print(order.get(i));
		}
	}
}
