package baekjoon;

import java.util.*;

public class BOJ_1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Word> list = new ArrayList<Word>();
		ArrayList<String> list2 = new ArrayList<String>();
		int N = sc.nextInt();
		Word[] word = new Word[N];
		for (int i = 0; i < N; i++) {
			word[i] = new Word(sc.next());
			list.add(word[i]);
		}
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			if (!list2.contains(list.get(i).getWord())) {
				list2.add(list.get(i).getWord());
			}
		}
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}
}

class Word implements Comparable<Word> {
	private String word;

	Word() {

	}

	Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int compareTo(Word a) {
		if (this.word.length() < a.getWord().length()) {
			return -1;
		} else if (this.word.length() > a.getWord().length()) {
			return 1;
		} else
			return this.getWord().compareTo(a.getWord());
	}
}
