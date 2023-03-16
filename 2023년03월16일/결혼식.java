package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Time implements Comparable<Time>{
	public int time;
	public char state;
	
	Time(int time, char state){
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Time o) {
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
}

// 결혼식
public class Inf_9_3 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Time> arr = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int sT = Integer.parseInt(st.nextToken());
			int eT = Integer.parseInt(st.nextToken());
			
			arr.add(new Time(sT, 's'));
			arr.add(new Time(eT, 'e'));
		}

		int answer = Integer.MIN_VALUE;
		int cnt = 0;
		Collections.sort(arr);
		
		for(Time t : arr) {
			if(t.state == 's') {
				cnt++;
			}else {
				cnt--;
			}
			
			answer = Math.max(answer, cnt);
		}
		
		System.out.println(answer);
		
	}
}
