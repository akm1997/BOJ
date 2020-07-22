package baekjoon;

import java.util.*;

public class BOJ_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fixed = sc.nextInt();
		double variable = sc.nextInt();
		double benefit = sc.nextInt();
		double i = 0;

		if (variable >= benefit) {
			System.out.println(-1);
		} else {
			i = fixed / (benefit - variable);
			System.out.print((int) i + 1);
		}
	}
}
// 가변 비용이 수입보다 크면 손익분기점은 없다
// 고정비용+가변비용*i>수입*i
