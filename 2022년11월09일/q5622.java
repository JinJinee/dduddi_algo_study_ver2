package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q5622 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int[] a = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			int n = s.charAt(i);
			int index = n-65;
			count += a[index];
		}System.out.println(count);
	}

}
