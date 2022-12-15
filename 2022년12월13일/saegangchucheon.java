package Bjalgorism;

import java.io.*;

public class saegangchucheon {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine(); // a1
		int x = s.charAt(1)-'0';
		int y = s.charAt(0)-96;
		
		int count = 0;

		if (x <= 6 && y != 8) count++;
		if (x <= 6 && y != 1) count++;
		if (x >= 3 && y != 8) count++;
		if (x >= 3 && y != 1) count++;
		if (x != 1 && y >= 3) count++;
		if (x != 8 && y >= 3) count++;
		if (x != 1 && y <= 6) count++;
		if (x != 8 && y <= 6) count++;
		System.out.println(count);

	}
}
