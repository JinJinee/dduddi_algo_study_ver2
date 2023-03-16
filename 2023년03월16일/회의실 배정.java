package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 회의실 배정
public class inf_9_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] mt = new int[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			mt[i][0] = Integer.parseInt(st.nextToken());
			mt[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(mt, (o1, o2) -> o1[0] - o2[0]);
		Arrays.sort(mt, (o1, o2) -> o1[1] - o2[1]);
		
		int cnt = 0;
		int endTime = 0;
		for(int i=0; i<n; i++) {
			if(mt[i][0] >= endTime) {
				endTime = mt[i][1];
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}
