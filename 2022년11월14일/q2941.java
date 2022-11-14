package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2941 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.length() - i > 2) {
				if(s.charAt(i)=='d'&&s.charAt(i+1)=='z'&&s.charAt(i+2)=='=') {
					i += 2;
				}
			}
			if(s.length() - i > 1) {
				if(s.charAt(i) == 'c' && s.charAt(i+1) == '=') {
					count++;
					i += 1;
				}else if(s.charAt(i) == 'c' && s.charAt(i+1) == '-') {
					count++;
					i += 1;
				}else if(s.charAt(i) == 'd' && s.charAt(i+1)=='-') {
					count++;
					i+=1;
				}else if(s.charAt(i)=='l'&&s.charAt(i+1)=='j') {
					count++;
					i+=1;
				}else if(s.charAt(i) == 'n' && s.charAt(i+1)=='j') {
					count++;
					i+=1;
				}else if(s.charAt(i)=='s' && s.charAt(i+1)=='=') {
					count++;
					i+=1;
				}else if(s.charAt(i)=='z' && s.charAt(i+1)=='=') {
					count++;
					i+=1;
				}else {
					count++;
				}
			}else count++;			
		}System.out.println(count);
	}

}
