// ATM
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            p[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
        int t = 0;

        for(int i=1; i<n; i++){
            p[i] = p[i-1] + p[i];
        }
        
        for(int i=0; i<n; i++){
            t += p[i];
        }

        System.out.println(t);
    }
}
