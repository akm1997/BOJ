package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));
		int N = Integer.parseInt(br.readLine());
		int[] list = new int[N];
		for (int i = 0; i < list.length; i++) {
			list[i] = Integer.parseInt(br.readLine());
		}
		bw.write(average(list) + "\n");
		bw.write(center(list) + "\n");
		bw.write(most(list) + "\n");
		bw.write(size(list) + "\n");

		bw.flush();

	}

	public static int average(int[] list) {
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		return (int) Math.round((double) sum / (double) list.length);
	}

	public static int center(int[] list) {
		ArrayList<Integer> order = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			order.add(list[i]);
		}
		Collections.sort(order);
		return order.get((list.length - 1) / 2);
	}

	public static int most(int[] list) {
		int[] count = new int[8001];
		ArrayList<Integer> maxlist = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			if (list[i] >= 0) {
				count[list[i]]++;
			} else {
				count[Math.abs(list[i]) + 4000]++;
			}
		}
		int max = count[0];
		for (int i = 0; i < count.length-1; i++) {     //배열중 최빈값을 구함
			if (max <= count[i+1]) {
				max = count[i+1];
			}
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {                       //최빈값과 같은 값이 잇으면 list에 추가
				if (i <= 4000) {                           
					maxlist.add(i);
				} else {
					maxlist.add((i - 4000) * -1);
				}
			}
		}
		Collections.sort(maxlist);                   //list 정렬
		if (maxlist.size() > 1) {
			return maxlist.get(1);                 //최빈값이 여러개인경우 두번째 값 출력
		}else
			return maxlist.get(0);

	}

	public static int size(int[] list) {
		int result = 0;
		ArrayList<Integer> size = new ArrayList<Integer>();
		for (int i = 0; i < list.length; i++) {
			size.add(list[i]);
		}
		Collections.sort(size);
		result = (size.get(size.size() - 1)) - size.get(0);
		return result;
	}
}
