package baekjoon;

import java.util.*;

public class BOJ_4948 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<>();
		while (!input.contains(0)) { 
			input.add(sc.nextInt());
		}
		for (int i = 0; i < input.size() - 1; i++) {  //0까지 입력받기 떄문에 -1
			num = numPrime(input.get(i));
			System.out.println(num);
			num = 0;
		}

	}

	static int numPrime(int n) {
		boolean[] isPrime = new boolean[2 * n + 1];
		isPrime[0] = true;     //true =소수가 아님
		isPrime[1] = true;
		int num = 0;
		for (int i = 2; i * i <= (2 * n); i++) {
			if (isPrime[i] == false) {
				for (int j = i * i; j <= (2 * n); j += i) {
					isPrime[j] = true;
				}
			}
		}
		for (int i = n + 1; i < isPrime.length; i++) {
			if (isPrime[i] == false) {
				num++;
			}
		}
		return num;
	}
}
