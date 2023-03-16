import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			if(!map.containsKey(tmp)) {
				map.put(tmp, 1);
			}else {
				map.put(tmp, map.get(tmp)+1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			sb.append(map.get(tmp) != null ? map.get(tmp) : 0).append(" ");
		}
		
		System.out.println(sb);	
		
	}
}
