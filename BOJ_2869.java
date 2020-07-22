package baekjoon;

import java.util.*;

public class BOJ_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double V = sc.nextInt();
		if ((V - A) % (A - B) == 0) {
			System.out.println((int) ((V - A) / (A - B) + 1));
		} else {
			System.out.println((int) ((V - A) / (A - B) + 2));
		}
/*
 * 목적지에 도착하면 내려오지 않는다
 * 목적지의 높이에서 낮에 움직이는 거리만큼 빼서 계산한후
 * 나누어 떨어지면 한번만 올라가면 되므로 +1
 * 나누어 떨어지지 않는다면 두번 더 올라가야하므로 +2
 */
	}
}
