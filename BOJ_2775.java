package baekjoon;

import java.util.*;

public class BOJ_2775 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] floor = new int[T];// 층
		int[] number = new int[T];// 호수 인원
		int[] n = new int[14];
		int[] result = new int[T];
		for (int i = 0; i < T; i++) {
			floor[i] = sc.nextInt();
			number[i] = sc.nextInt();
			for (int j = 0; j <= floor[i]; j++) {  
				if (j == 0) {         //0층은 ->123456....
					for (int k = 0; k < number[i]; k++) {
						n[k] = k + 1;
					}
				} else     
					for (int k = 1; k < number[i]; k++) { //현재층 k호수  = 전층의 k-1호수+k호수 
						n[k] = n[k - 1] + n[k];
					}

			}
			result[i] = n[number[i] - 1];

		}
		for (int i = 0; i < T; i++) {
			System.out.println(result[i]);
		}

	}
}
