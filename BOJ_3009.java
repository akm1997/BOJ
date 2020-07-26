package baekjoon;

import java.util.*;

public class BOJ_3009 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Point> point = new ArrayList<Point>();
		int last = 0;
		while (true) {
			point.add(new Point(sc.nextInt(), sc.nextInt(), sc.nextInt()));
			last = point.size() - 1;
			if (point.get(last).getX() == 0 && point.get(last).getY() == 0
					&& point.get(last).getZ() == 0) {
				point.remove(last);
				break;
			}
		}

		for (int i = 0; i < point.size(); i++) {
			if (Pytha(point.get(i))) {
				System.out.println("right");
			} else
				System.out.println("wrong");
		}
	}

	public static boolean Pytha(Point a) {
		if (a.getX() > a.getY() && a.getX() > a.getZ()) {
			if (a.getX() * a.getX() == a.getY() * a.getY() + a.getZ()
					* a.getZ()) {
				return true;
			} else
				return false;
		} else if (a.getY() > a.getX() && a.getY() > a.getZ()) {
			if (a.getY() * a.getY() == a.getX() * a.getX() + a.getZ()
					* a.getZ()) {
				return true;
			} else
				return false;
		} else if (a.getZ() > a.getX() && a.getZ() > a.getY()) {
			if (a.getZ() * a.getZ() == a.getX() * a.getX() + a.getY()
					* a.getY()) {
				return true;
			} else
				return false;
		} else
			return false;

	}
}

class Point { // Point 클래스
	private int x;
	private int y;
	private int z;

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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	Point() {
	}

	Point(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}