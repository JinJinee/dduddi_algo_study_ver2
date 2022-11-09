package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class q2908 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String s = br.readLine();
		st = new StringTokenizer(s);
		
		String a = st.nextToken();
		String b = st.nextToken();
		char [] ra = new char[3];
		char [] rb = new char[3];
		int j = 2;
		for(int i=0; i<=2; i++) {
			ra[i] = a.charAt(j);
			rb[i] = b.charAt(j);
			j--;
		}
		for(int i=0; i<3; i++) {
			if(ra[i]>rb[i]) {
				for(int k=0; k<3; k++) {
					sb.append(ra[k]);
				}
				break;
			}else if(ra[i]<rb[i]) {
				for(int k=0; k<3; k++){
					sb.append(rb[k]);			
				}
				break;
			}
		
		}System.out.println(sb);
	}
}
