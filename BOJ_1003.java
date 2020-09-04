package baekjoon;

import java.io.*;


public class BOJ_1003 {
	public static void main(String args[]) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[][] memo = new long[41][41];
		memo[0][0] = 1;
		memo[0][1] = 0;
		memo[1][0] = 0;
		memo[1][1] = 1;
		for (int i = 2; i <= 40; i++) {
			memo[i][0] = memo[i - 2][0] + memo[i - 1][0];
			memo[i][1] = memo[i - 2][1] + memo[i - 1][1];
		}
		int T = Integer.parseInt(br.readLine());
		int[] input = new int[T];
		for (int i = 0; i < T; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < T; i++) {
			bw.write(memo[input[i]][0] + " " + memo[input[i]][1] + "\n");
		}
		bw.flush();
	}
}
