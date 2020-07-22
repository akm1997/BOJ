package baekjoon;

import java.util.*;

public class BOJ_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int min = 0;
		boolean flag = false;
		for (int i = M; i <= N; i++) {
			if (isPrime(i) == true) {
				min = i;
				break;
			}
		}
		for (int i = M; i <= N; i++) {
			flag = isPrime(i);
			if (isPrime(i) == true)
				break;
		}
		if (flag == true) {
			System.out.println(sumPrime(M, N));
			System.out.println(min);
		} else
			System.out.println(-1);

	}

	static int sumPrime(int M, int N) { // 소수의 합구하는 메서드
		int sum = 0;
		for (int i = M; i <= N; i++) {
			if (isPrime(i) == true) {
				sum += i;
			}
		}
		return sum;
	}

	static boolean isPrime(int num) { // 소수판별 메서드

		int i = 2;
		if (num == 1)
			return false;
		else if (num == 2) {
			return true;
		} else {
			while (i < num) {
				if (num % i == 0)
					return false;
				i++;
			}
			return true;
		}
	}
}
