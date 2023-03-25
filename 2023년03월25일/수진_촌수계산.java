import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 촌수계산

public class BOJ_2644 {
	static int n;
	static int[][] map;
	static int[] d;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 전체 사람 수
		n = Integer.parseInt(br.readLine());
		
		// 촌수를 계산해야 하는 서로 다른 두 사람의 번호
		st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		map = new int[n+1][n+1];
		
		
		// 부모 자식들 간의 관계의 개수
		int m = Integer.parseInt(br.readLine());
		
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			map[x][y] = 1;
			map[y][x] = 1;
		}
		
		d = new int[n+1];
		
		BFS(A, B);
		if(d[B] == 0) System.out.println(-1);
		else System.out.println(d[B]);
		
	}
	
	static void BFS(int start, int end) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(start);
		while(!q.isEmpty()) {
			int v = q.poll();
			
			if(v==end) break;
			
			for(int i=1; i<=n; i++) {
				if(map[v][i] == 1 && d[i] == 0) {
					d[i] = d[v] + 1;
					q.add(i);
				}
			}
		}
	}
}


