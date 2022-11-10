package Bjalgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class q1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0; i<t; i++) {
			String s = br.readLine();
			List<Character> ls = new ArrayList<>();
			boolean flag = true;
			for(int j=0; j<s.length(); j++){
				char k = s.charAt(j);
				if(!ls.contains(k)) {
					ls.add(k);
				}else if(ls.contains(k)) {
					if(k==ls.get(ls.size()-1)) {
						ls.add(k);
					}else {
						flag = false;
						break;
					}
				}
				
			}if(flag) count++;
		}System.out.println(count);
	}

}
