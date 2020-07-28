package baekjoon;

import java.util.*;

public class BOJ_2231 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int input = sc.nextInt();
		int sum = 0;
		
			for (int i = 0; i < input; i++) {     //입력받은값을 각 자리수대로 계산하기 위해 문자열로 변환
				String num = Integer.toString(i);
				for (int j = 0; j < num.length(); j++) {
					sum += num.charAt(j) - '0';    //각 자리수의 합 
				}
				if (i + sum == input) {            //원래 값과 자리수의 합이 입력값과 같을경우 배열에 추가
					list.add(i);
				}
				sum = 0;
			}
			
		Collections.sort(list);     //배열을 정렬한다.
		if (list.size() == 0) {
			System.out.println(0);
		} else {
			System.out.println(list.get(0));
		}
	}

}
