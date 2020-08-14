package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_15652 {

	BufferedWriter bw;
	BufferedReader br;
	int m, n;
	int[] list;

	public static void main(String[] args) throws IOException {
		BOJ_15652 b = new BOJ_15652();
		b.start();

	}

	public void start() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		String[] tmp = input.split(" ");
		n = Integer.parseInt(tmp[0]);
		m = Integer.parseInt(tmp[1]);
		list = new int[9];
		dfs(0);
		bw.flush();

	}

	void dfs(int cnt) throws IOException {

		if (cnt == m) {
			for (int i = 0; i < m; i++) {
				bw.write(list[i] + " ");
			}
			bw.write("\n");

			return;
		}
		for (int i = 1; i <= n; i++) {
			if (cnt > 0) {
				if (list[cnt - 1] > i) {
					continue;
				}
			}
			list[cnt] = i;
			dfs(cnt + 1);

		}

	}
}
