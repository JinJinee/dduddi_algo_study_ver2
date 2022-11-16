package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int []a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int a1 = a[i];
				int a2 = a[j];
				if(a[i]>a[j]) {
					a[i] = a2;
					a[j] = a1;
					
				}
			}
		}
		for(int num:a) {
			System.out.println(num);
		}
		
		
	}

}
