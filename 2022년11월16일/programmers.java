package programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PG_Test {

	public static void main(String[] args) throws IOException {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		List<Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {
			if ((100 - progresses[i]) % speeds[i] == 0) {
				q.add((100 - progresses[i]) / speeds[i]);
			} else {
				q.add(((100 - progresses[i]) / speeds[i]) + 1);
			}
		}

		int tmp = q.poll();
		int cnt = 1;

		if (q.isEmpty()) {
			list.add(cnt);
		} else {

			while (!q.isEmpty()) {
				if (q.peek() <= tmp) {
					cnt++;
					q.poll();
				} else {
					list.add(cnt);
					cnt = 1;
					tmp = q.poll();
				}
			}
			list.add(cnt);
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		System.out.println(Arrays.toString(answer));
	}
}
