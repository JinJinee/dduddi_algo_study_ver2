package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q10809 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine();
		String [] a = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		
			for(int j=0; j<26; j++) {
				if(!s.contains(a[j])) {
					a[j] = "-1";
				}else {
					for(int i=0; i<s.length(); i++) {
						String n = String.valueOf(s.charAt(i));
						if(a[j].equals(n)) {
							a[j] = Integer.toString(i);
						}
					}
				}
			
			}
			
			
			for(String n : a) {
			  sb.append(n+" ");
		  }System.out.println(sb);
	}

	//'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'

}
