import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 특정 거리의 도시 찾기
public class BOJ_18352 {
	static boolean[] visited;
	static ArrayList<Integer>[] list;
	static ArrayList<Integer> result;
	static int k;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 도시의 개수
		int n = Integer.parseInt(st.nextToken());
		// 도로의 개수
		int m = Integer.parseInt(st.nextToken());
		// 거리 정보
		k = Integer.parseInt(st.nextToken());
		// 출발 도시의 번호
		int x = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n+1];
		list = new ArrayList[n+1];
		result = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			list[s].add(e);
		}
		
		BFS(x);
		
		if(result.isEmpty()) {
			System.out.println(-1);
		}else {
			Collections.sort(result);
			
			for(int i=0; i<result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
	}
	
	static void BFS(int n) {
		Queue<Node> q = new LinkedList<>();
		visited[n] = true;
		q.add(new Node(0, n));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			int dis = node.dis;
			int point = node.point;
			
			if(dis == k) {
				result.add(point);
			}
			
			for(int i : list[point]) {
				if(!visited[i]) {
					visited[i] = true;
					q.add(new Node(dis+1, i));
				}
			}
		}
	}
}

class Node{
	int dis;
	int point;
	
	Node(int dis, int point){
		this.dis = dis;
		this.point = point;
	}
}
