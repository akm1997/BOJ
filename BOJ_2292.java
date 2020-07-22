package baekjoon;

import java.util.Scanner;

public class BOJ_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int key = 1;
		int i = 1;
		while (true) {
			if (num == 1) {
				System.out.println(1);
				break;
			} else if (key < num && num <= key + 6 * i) {
				System.out.println(i + 1);
				break;
			} else {
				key = key + 6 * i;
				i++;
			}
		}//다음 벌집 둘레의 갯수는 6개씩 늘어난다.
	}	//INPUT값의 구간을 몇번 둘레에 있는 지 파악한다.
}
