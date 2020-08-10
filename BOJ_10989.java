package baekjoon;

import java.io.*;

public class BOJ_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));
		int input;
		int[] count = new int[10001];
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i < 10001; i++) {
			count[i] = 0;
		}
		for (int i = 1; i <= N; i++) {
			input = Integer.parseInt(br.readLine());
			count[input]++;
		}
		for (int i = 1; i < 10001; i++) {
			for (int j = 0; j < count[i]; j++) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
	}
}
