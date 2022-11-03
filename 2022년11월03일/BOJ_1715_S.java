import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 카드 정렬하기
public class BOJ_1715_S {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			           
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue();
		
		while(n-- > 0) {
			pq.add(Integer.parseInt(br.readLine()));
		}
		
		long result = 0;
		if(pq.size() == 1) {
			System.out.println(pq.poll());
		}else {
			while(!pq.isEmpty()) {
				if(pq.size() >= 2) {
					int tmp = pq.poll() + pq.poll();
					result += tmp;
					if(!pq.isEmpty()) {
						pq.add(tmp);					
					}
				}else {
					result += pq.poll();
				}
			}
			System.out.println(result);
		}
	}
}
