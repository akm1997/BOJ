package baekjoon;

import java.util.*;

public class BOJ_2798 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int[] Card = new int[N];

		for (int i = 0; i < Card.length; i++) {
			Card[i] = sc.nextInt();
		}
		for (int i = 0; i < N - 2; i++) {                  //모든 카드를 더한 경우의 수
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					result.add(Card[i] + Card[j] + Card[k]);
				}
			}

		}
		ArrayList<Integer> compare = new ArrayList<Integer>();    //M과 3카드를 더한 값의 차를 저장하는 배열

		for (int i = 1; i < result.size(); i++) {
			if (M - result.get(i) >= 0) {						
				compare.add(result.get(i));                    //정렬
			}

		}
		Collections.sort(compare);
		System.out.println(compare.get(compare.size() - 1));

	}
}
