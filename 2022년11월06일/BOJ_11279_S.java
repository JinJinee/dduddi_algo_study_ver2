package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_11279_S {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
        while(N-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(pq.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }else{
                pq.add(x);
            }
        }
        System.out.println(sb);
    }
}
