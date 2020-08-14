package baekjoon;
//backtraking algorithm
import java.util.*;

public class BOJ_15649 {
	static int M, N;
	static int list[], visited[];
//cnt 는 depth 와 같다
	static void dfs(int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(list[i] + " ");
			}
			System.out.println("");
			return;
		}
		for (int i = 1; i <= N; i++) {   //각depth값을 반복문 돌려서 N까지의 값 설정
			if (visited[i] == 1)
				continue;
			visited[i] = 1;    //cnt==0 은 depth ==0 일떄를 의미
			list[cnt] = i;     
			dfs(cnt + 1);      //다음 depth 값 위해 recursion
			visited[i] = 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		visited = new int[9];
		list = new int[9];
		dfs(0);
	}
}
