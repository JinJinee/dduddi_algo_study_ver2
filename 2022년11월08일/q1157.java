package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int [] arr = new int[26];
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			int n = s.charAt(i);
			if(n>90) {
				arr[n-97]++;
			}else if(n>=65&&n<=90) {
				arr[n-65]++;
			}
		}
		int max = -1;
		for(int j=0; j<arr.length;j++) {
			if(max<arr[j]) {
				max = arr[j];
				sb.delete(0, sb.length());
				sb.append((char)(j+65));
			}else if(max == arr[j]&&arr[j]!=0) {
				sb.delete(0, sb.length());
				sb.append("?");
			}
			
		}
		System.out.println(sb);
		
	}
}