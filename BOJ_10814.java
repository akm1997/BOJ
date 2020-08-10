package baekjoon;

import java.util.*;

public class BOJ_10814 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> list = new ArrayList<Member>();
		int N = sc.nextInt();
		Member[] member = new Member[N];
		for (int i = 0; i < N; i++) {
			member[i] = new Member(sc.nextInt(), sc.next(), i);
			list.add(member[i]);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getAge() + " "
					+ list.get(i).getName());
		}
	}
}

class Member implements Comparable<Member> {
	private int age;
	private String name;
	private int order;

	Member() {

	}

	Member(int age, String name, int order) {
		this.age = age;
		this.name = name;
		this.order = order;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public int compareTo(Member a) {
		if (this.age < a.age) {
			return -1;
		} else if (this.age > a.age) {
			return 1;
		} else {
			if (this.order < a.order) {
				return -1;
			} else
				return 1;
		}

	}
}