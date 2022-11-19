package stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2587 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] a = new int[5];
		
		for(int i =0; i<5; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i =0; i<5; i++) {
			for(int j =i+1; j<5; j++) {
				int su = a[i];
				int nsu = a[j];
				if(su>nsu) {
					a[i] = nsu;
					a[j] = su;
				} 
			}
			
		}
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		System.out.println(sum/5);
		System.out.println(a[2]);
		
		
		
		
	}

}
