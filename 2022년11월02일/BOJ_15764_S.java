import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// Milking Order
public class BOJ_15764_S {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); // 소의 수
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] order = new int[n + 1];
		int[] fix = new int[n + 1];
		boolean[] check = new boolean[n + 1];

		List<Integer> list = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			order[p] = c;
			fix[c] = p;
			check[c] = true;
		}

		if (list.contains(1)) {
			for (int i = 1; i < order.length; i++) {
				if (list.isEmpty())
					break;
				if (order[i] == 0) {
					int tmp = list.get(0);

					if (!check[tmp]) {
						order[i] = tmp;
						check[tmp] = true;
						list.remove(0);
					} else {
						list.remove(0);
						i = fix[tmp];
					}
				}
			}

		} else {
			for (int i = n; i > 0; i--) {
				if (list.isEmpty())
					break;
				if (order[i] == 0) {
					int tmp = list.get(list.size() - 1);

					if (!check[tmp]) {
						order[i] = tmp;
						check[tmp] = true;
						list.remove(list.size() - 1);
					} else {
						list.remove(list.size() - 1);
						i = fix[tmp];
					}
				}
			}
		}
		
		if(check[1]) {
			for(int i=1; i<order.length; i++) {
				if(order[i] == 1) {
					System.out.println(i);
					break;
				}
			}
		}else {
			for(int i=1; i<order.length; i++) {
				if(order[i] == 0) {
					System.out.println(i);
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(order));
	}
}
