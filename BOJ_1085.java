package baekjoon;

import java.util.*;

public class BOJ_1085 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int w;
		int h;
		int a;
		int b;
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		if (w - x >= x) {
			a = x;
		} else
			a = w - x;
		if (h - y >= y) {
			b = y;
		} else
			b = h - y;
		if (a > b) {
			System.out.println(b);
		} else
			System.out.println(a);
	}
}
