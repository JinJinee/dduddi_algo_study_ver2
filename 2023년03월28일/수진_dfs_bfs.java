import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// DFS와 BFS
public class BOJ_1260 {
	static boolean[] visited;
	static ArrayList<Integer>[] list;
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[n+1];
		
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			list[s].add(e);
			list[e].add(s);
		}
		
		for(int i=1; i<=n; i++) {
			Collections.sort(list[i]);
		}
		
		visited = new boolean[n+1];
		DFS(v);
		
		sb.append("\n");
		
		visited = new boolean[n+1];
		BFS(v);
		
		System.out.println(sb);
		
		
	}
	
	static void DFS(int s) {
		visited[s] = true;
		sb.append(s).append(" ");
		
		for(int i : list[s]) {
			if(!visited[i]) {
				DFS(i);
			}
		}
	}
	
	static void BFS(int s) {
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		visited[s] = true;
		
		while(!q.isEmpty()) {
			int n = q.poll();
			sb.append(n).append(" ");
			
			for(int i : list[n]) {
				if(!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
	
	
}
