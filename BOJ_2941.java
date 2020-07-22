package baekjoon;

import java.util.*;

public class BOJ_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int num = 0;
		int start = 0;
		boolean key = true;
		while (key) {
			if (input.contains("c=")) {
				num++;
				input = input.replaceFirst("c=", " ");
			} else if (input.contains("c-")) {
				num++;
				input = input.replaceFirst("c-", " ");
			} else if (input.contains("dz=")) {
				num++;
				input = input.replaceFirst("dz=", " ");
			} else if (input.contains("d-")) {
				num++;
				input = input.replaceFirst("d-", " ");
			} else if (input.contains("lj")) {
				num++;
				input = input.replaceFirst("lj", " ");
			} else if (input.contains("nj")) {
				num++;
				input = input.replaceFirst("nj", " ");
			} else if (input.contains("s=")) {
				num++;
				input = input.replaceFirst("s=", " ");
			} else if (input.contains("z=")) {
				num++;
				input = input.replaceFirst("z=", " ");
			} else {
				input = input.replaceAll(" ", "");
				num += input.toCharArray().length;
				key = false;
			}
		}
		System.out.println(num);
	}
}
