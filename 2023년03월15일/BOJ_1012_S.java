import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1012 {
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	static int M;
	static int N;
	static int K;
	static int[][] board;
	static int cnt;
	static int result;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			cnt = 0;
			result = 0;
			board = new int[M][N];

			for(int i=0; i<K; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				board[x][y] = 1;
			}
			
			
			for(int i=0; i<M; i++) {
				for(int j=0; j<N; j++) {
					if(board[i][j] == 1) {
						result++;
						DFS(i, j);
					}
					if(cnt == K) break;
				}
			}
			
			sb.append(result).append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	static void DFS(int x, int y) {
		board[x][y] = 0;
		cnt++;
		
		for(int i=0; i<4; i++) {
			int tx = x + dx[i];
			int ty = y + dy[i];
			if(tx>=0 && tx<M && ty>=0 && ty<N && board[tx][ty] == 1) {
				DFS(tx, ty);
			}
		}
	}

}
