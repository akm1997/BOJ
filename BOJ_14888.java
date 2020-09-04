package baekjoon;

import java.util.*;

public class BOJ_14888 {
	static int N;
	static int[] op;
	static int[] num;
	static ArrayList<Integer> list;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		list = new ArrayList<Integer>();
		N = sc.nextInt();
		num = new int[N];
		op = new int[4];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < op.length; i++) {
			op[i] = sc.nextInt();
		}
		dfs(num[0], 1);
		Collections.sort(list);
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.get(0));
	}

	static void dfs(int sum, int index) {
		for (int i = 0; i < op.length; i++) {
			if (op[i] != 0) {
				op[i]--;
				switch (i) {
				case 0:

					dfs(sum + num[index], index + 1);
					break;
				case 1:

					dfs(sum - num[index], index + 1);
					break;
				case 2:

					dfs(sum * num[index], index + 1);
					break;
				case 3:

					dfs(sum / num[index], index + 1);
					break;
				}
				op[i]++;
			}
		}
		if (index == N) {
			list.add(sum);
		}

	}
}
