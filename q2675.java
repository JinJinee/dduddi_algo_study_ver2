package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2675 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<t; i++) {
			String str = br.readLine();
			st = new StringTokenizer(str);
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			for(int k=0; k<s.length(); k++) {
				for(int j=0; j<r; j++) {
					sb.append(s.charAt(k));
				}	
			}sb.append("\n");
		}System.out.println(sb);
		
	}

}
