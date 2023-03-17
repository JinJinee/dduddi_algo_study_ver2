import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 섬의 개수

public class BOJ_4963 {
	static int[] dx = {0, -1, 0, 1, -1, 1, 1, -1};
	static int[] dy = {1, 0, -1, 0, -1, -1, 1, 1};
	static int[][] board;
	static int cnt;
	static int w;
	static int h;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			cnt = 0;
			if(w == 0 && h == 0) break;
			
			board = new int[w][h];
			
			if(w == 1 && h == 1) board[0][0] = Integer.parseInt(br.readLine());
			else {
				for(int i=0; i<h; i++) {
					st = new StringTokenizer(br.readLine());
					for(int j=0; j<w; j++) {
						board[j][i] = Integer.parseInt(st.nextToken());
					}
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(board[j][i] == 1) {
						DFS(j, i);
						cnt++;
					}
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	static void DFS(int x, int y){
		board[x][y] = 0;
		
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && nx<w && ny>=0 && ny<h && board[nx][ny] == 1) {
				DFS(nx, ny);
			}
		}
	}
}
