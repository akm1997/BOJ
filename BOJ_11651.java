package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				System.out));
		int N = Integer.parseInt(br.readLine());
		Point[] point = new Point[N];
		ArrayList<Point> order = new ArrayList<Point>();
		for (int i = 0; i < N; i++) {

			String input = br.readLine();
			String[] tmp = input.split(" ");
			point[i] = new Point(Integer.parseInt(tmp[0]),
					Integer.parseInt(tmp[1]));
			order.add(point[i]);
		}
		Collections.sort(order);
		for (int i = 0; i < order.size(); i++) {
			bw.write(order.get(i).getX() + " " + order.get(i).getY() + "\n");
		}
		bw.flush();
	}
}

class Point implements Comparable<Point> {
	private int x;
	private int y;

	Point() {

	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int compareTo(Point a) {
		if (this.y < a.y) {
			return -1;
		} else if (this.y > a.y) {
			return 1;
		} else {
			if (this.x < a.x) {
				return -1;
			} else
				return 1;
		}
	}

}
