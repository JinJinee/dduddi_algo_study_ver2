package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18511 {
    static String[] K;
    static int kn; 
    static int N;
    static int result = 0;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        kn = Integer.parseInt(st.nextToken());

        K = new String[kn];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<kn; i++){
            K[i] = st.nextToken();
        }

        DFS(0, 0);

        System.out.println(result);   
    }

    static void DFS(int depth, int num){
        if(num > N) return;
        if(result < num){
            result = num;
        }
        for(int i=0; i<kn; i++){
            String tmp = Integer.toString(num);
            tmp += K[i]; 
            DFS(depth+1, Integer.parseInt(tmp));
        }       
    }
}
