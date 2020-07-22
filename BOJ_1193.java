package baekjoon;

import java.util.Scanner;

public class BOJ_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i = 1;
		int turn = 1;
		String result;
		while (true) {
			input -= i;       //대각선수의 개수 1,2,3,4,.....
			if (input > 0) {   	//입력받은 INPUT에서 대각선의 갯수만큼 뺸다
				i++;        	//더이상 뺄수 없을때 남은 INPUT값으로 값을 구함
				turn++;			//뺄때마다 TURN값을 증가
			} else {				
				input += i;
				break;
			}
		}

		if (turn % 2 != 0) { //TURN이 짝수이면 분모가 더 큰수부터 홀수이면 반대로
			result = (turn - input + 1) + "/" + (input);
		} else {
			result = (input) + "/" + (turn - input + 1);
		}

		System.out.println(result);
	}
}
