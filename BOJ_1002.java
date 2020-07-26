package baekjoon;

import java.util.*;

public class BOJ_1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Turret[] A = new Turret[T];
		Turret[] B = new Turret[T];
		for (int i = 0; i < T; i++) {
			A[i] = new Turret(sc.nextInt(), sc.nextInt(), sc.nextInt());
			B[i] = new Turret(sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		for (int i = 0; i < T; i++) {
			if(distance(A[i], B[i]) ==0&&A[i].getR()== B[i].getR()){      //반지름이 같은 두 원이 완전히 겹칠때
				System.out.println(-1);	
			}
			else if (distance(A[i], B[i]) == A[i].getR() + B[i].getR()          // 외접,내접일경우
					|| distance(A[i], B[i]) == Math.abs(A[i].getR()
							- B[i].getR())) {
				System.out.println(1);
			} else if (distance(A[i], B[i]) > A[i].getR() + B[i].getR()) { // 접하지 않을경우														    
				System.out.println(0);
			} else if (distance(A[i], B[i]) > Math.abs(A[i].getR()         // 두 교점이 있을경우
					- B[i].getR())
					&& distance(A[i], B[i]) < Math.abs(A[i].getR()
							+ B[i].getR())) {
				System.out.println(2);
			} else if (distance(A[i], B[i]) < Math.abs(A[i].getR()         // 작은 원이 큰원 내부에 있고 접하지 않을 경우
					- B[i].getR())) {                              
				System.out.println(0);
			} 
		}

	}

	public static double distance(Turret A, Turret B) { // 터렛 사이의 거리
		double distance=Math.sqrt((A.getX() - B.getX())*(A.getX() - B.getX()) + (A.getY() - B.getY())*(A.getY() - B.getY()));
		return distance;
	}
}

class Turret {
	private int x;
	private int y;
	private int r;

	Turret(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	Turret() {
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

}
